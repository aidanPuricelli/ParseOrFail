package parseorfail;

import java.util.LinkedList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import parseorfail.deliverable2Lexer;

public class CustomLexer extends deliverable2Lexer {
    private LinkedList<Integer> indentStack = new LinkedList<>();
    private boolean atStartOfLine = true;

    public CustomLexer(CharStream input) {
        super(input);
        indentStack.push(0);
    }

    @Override
    public Token nextToken() {
        if (atStartOfLine()) {
            int currentIndent = 0;
            while (_input.LA(1) == ' ' || _input.LA(1) == '\t') {
                if (_input.LA(1) == ' ') {
                    currentIndent++;
                } else {
                    currentIndent += 4;
                }
                //printDebugInfo(currentIndent);
                _input.consume();
                _tokenStartCharPositionInLine++; // Advance the character position
            }

            handleIndentation(currentIndent);
        }

        Token token = super.nextToken();

        // Update line number and reset char position if newline
        if (token.getType() == NEWLINE) {
            _tokenStartLine++;
            _tokenStartCharPositionInLine = 0;
            atStartOfLine = true;
        } else {
            atStartOfLine = false;
        }

        emitAdditionalDedentAtEOF();

        return token;
    }

    private void handleIndentation(int currentIndent) {
        if (_input.LA(1) != '\r' && _input.LA(1) != '\n' && _input.LA(1) != EOF) {
            if (currentIndent > indentStack.peek()) {
                indentStack.push(currentIndent);
                emitIndentDedentTokens(deliverable2Lexer.INDENT);
            } else {
                while (currentIndent < indentStack.peek()) {
                    indentStack.pop();
                    emitIndentDedentTokens(deliverable2Lexer.DEDENT);
                }
            }
        }
    }

    private void emitAdditionalDedentAtEOF() {
        if (_input.LA(1) == EOF) {
            while (indentStack.size() > 1) {
                emitIndentDedentTokens(deliverable2Lexer.DEDENT);
                indentStack.pop();
            }
        }
    }

    @Override
    public void emit(Token token) {
        super.emit(token);
        atStartOfLine = (token.getType() == NEWLINE);
        // Debugging for emitted tokens
        //System.out.println("Emitted token: " + token.getText() + " Type: " + token.getType() + " Line: " + token.getLine() + " Char Position: " + token.getCharPositionInLine());
    }

    protected boolean atStartOfLine() {
        return atStartOfLine;
    }

    private void emitIndentDedentTokens(int tokenType) {
        CommonToken token = new CommonToken(_tokenFactorySourcePair, tokenType, Lexer.DEFAULT_TOKEN_CHANNEL, _tokenStartCharIndex, getCharIndex() - 1);
        token.setLine(_tokenStartLine);
        token.setCharPositionInLine(_tokenStartCharPositionInLine);
        emit(token);
    }

    private void printDebugInfo(int currentIndent) {
        System.out.println("currentIndent: " + currentIndent);
        System.out.println("type: " + _input.LA(1));
        System.out.println("line: " + getLine());
        System.out.println("char position: " + getCharPositionInLine());
    }
}

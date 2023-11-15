package parseorfail;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {
    public static void main(String[] args) {
        String resourcePath = "del2_testcases.py";

        try {
            // Use the class loader to get the resource as a stream
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(resourcePath);
            if (inputStream == null) {
                throw new IllegalArgumentException("Test file not found in resources.");
            }

            // Read test script file
            CharStream codeCharStream = CharStreams.fromStream(inputStream, StandardCharsets.UTF_8);

            // create lexer and parser
            deliverable2Lexer lexer = new CustomLexer(codeCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            deliverable2Parser parser = new deliverable2Parser(tokens);

            // parse the input and print the parse tree
            ParseTree tree = parser.program();
            System.out.println("Parse tree:");
            printTree(tree, parser,0);
            //System.out.println(tree.toStringTree(parser));  (string output that we originally had)

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // making the parse tree all pretty and stuff
    private static void printTree(ParseTree tree, Parser parser, int indent) {
        String nodeText = tree instanceof TerminalNode
                ? tree.getText()
                : parser.getRuleNames()[((RuleContext) tree).getRuleIndex()];
        System.out.println(" ".repeat(indent * 2) + nodeText);

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), parser, indent + 1);
        }
    }
}

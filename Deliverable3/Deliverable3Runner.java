import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.io.PrintWriter;
import java.io.File;

public class Deliverable3Runner {
    public static void main(String[] args) {
        String resourcePath = "project_deliverable_3_testcase.py";
        String outputPath = "parse_tree.txt";

        try {
            // Use the class loader to get the resource as a stream
            InputStream inputStream = Deliverable3Runner.class.getClassLoader().getResourceAsStream(resourcePath);
            if (inputStream == null) {
                throw new IllegalArgumentException("Test file not found in resources.");
            }

            // Read test script file
            CharStream codeCharStream = CharStreams.fromStream(inputStream, StandardCharsets.UTF_8);

            // create lexer and parser
            Deliverable3Lexer lexer = new Deliverable3Lexer(codeCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Deliverable3Parser parser = new Deliverable3Parser(tokens);

            // parse the input
            ParseTree tree = parser.program();

            PrintWriter writer = new PrintWriter(new File(outputPath));

            // Print the parse tree to the file
            printTree(tree, parser, 0, writer);

            // close the PrintWriter
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // making the parse tree all pretty and stuff
    private static void printTree(ParseTree tree, Parser parser, int indent, PrintWriter writer) {
        String nodeText = tree instanceof TerminalNode
                ? tree.getText()
                : parser.getRuleNames()[((RuleContext) tree).getRuleIndex()];
        writer.println(" ".repeat(indent * 2) + nodeText);

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), parser, indent + 1, writer);
        }
    }
}
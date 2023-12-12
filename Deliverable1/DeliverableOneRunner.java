import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DeliverableOneRunner {
    public static void main(String[] args) throws Exception {
        String[] testCases = {
            "assign1 = \"20\"",
            "assign2 = 123",
            "assign3 = 1.23",
            "assign4 = assign1",

            "arith_op1 = 1 + 2",
            "arith_op2 = 13 - 3",
            "arith_op3 = 10 / arith_op1",
            "arith_op4 = 4.2 * 10",
            "arith_op5 = arith_op1 % arith_op2",

            "arith_op1 += arith_op2",
            "arith_op2 -= arith_op3",
            "arith_op3 *= arith_op4",
            "arith_op4 /= arith_op5",

            "array1 = [1, 2, 3, 4, 5]",
            "array2 = ['a', 'b', 'c']",
            "array3 = [1.6, 2.7, 3.8, 4.9, 5.0]",

            "var1 = 10",
            "var2 = var1/2 + 5",
            "var3 = var2 % 2",
            "var4 = 1",

            "flag = True"
        };

        for (String testCase : testCases) {
            // Create an input stream from the test case
            CharStream input = CharStreams.fromString(testCase);

            // Create a lexer that feeds off of input
            DeliverableOneLexer lexer = new DeliverableOneLexer(input);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            DeliverableOneParser parser = new DeliverableOneParser(tokens);

            // Begin parsing at rule 'parse', which is the top-level rule
            ParseTree tree = parser.parse();

            // Print the parse tree (for debugging purposes)
            System.out.println(tree.toStringTree(parser));
        }
    }
}

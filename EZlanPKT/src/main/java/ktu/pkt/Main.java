package ktu.pkt;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ezlan.EZlanLexer;
import ezlan.EZlanParser;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/test/test.mu"};
        }

        System.out.println("parsing: " + args[0]);

        EZlanLexer lexer = new EZlanLexer(new ANTLRFileStream(args[0]));
        EZlanParser parser = new EZlanParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}

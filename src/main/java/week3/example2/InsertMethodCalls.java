package week3.example2;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InsertMethodCalls {

    public static void main(String[] args) throws IOException {
        String filename = "src/main/java/week3/example2/Test.java";
        FileInputStream in = new FileInputStream(filename);
        CompilationUnit compilationUnit;
        try {
            compilationUnit = StaticJavaParser.parse(in);
        } finally {
            in.close();
        }

        new ModifyMethods().visit(compilationUnit, null);
        System.out.println(compilationUnit.toString());
        byte[] modfile = compilationUnit.toString().getBytes();
        Path file = Paths.get(filename);
        Files.write(file,  modfile);
    }

    private static class ModifyMethods extends VoidVisitorAdapter {
        @Override
        public void visit(MethodDeclaration methodDeclaration, Object arg){
            //MethodCallExpr callPrint = new MethodCallExpr();
            //the scope of the method call is System.out
            //callPrint.setScope(new NameExpr("System.out"));
            //method we want to call is println
            //callPrint.setName("println");

            //can be built like this also
            MethodCallExpr callPrint = new MethodCallExpr(new NameExpr("System.out"), "println");

            //pass println an argument
            callPrint.addArgument(new StringLiteralExpr(methodDeclaration.getNameAsString()));

            // make print statement first thing that happens in the method
            //methodDeclaration.getBody().get().addStatement(0, callPrint);

            methodDeclaration.getBody().ifPresent(l -> l.addStatement(0, callPrint));
        }
    }
}

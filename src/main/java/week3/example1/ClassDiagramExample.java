package week3.example1;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.FileInputStream;
import java.io.IOException;

public class ClassDiagramExample {

    private int int1 = 0, int2 = 0;
    private String str1 = "";

    public static void main(String[] args) throws IOException {
//        String filename = "src/main/java/week3/example/ClassDiagramExample.java";
        String filename = "src/main/java/week3/example1/ClassDiagramVisitor.java";
        FileInputStream in = new FileInputStream(filename);

        CompilationUnit compilationUnit;
        try {
            compilationUnit = StaticJavaParser.parse(in);
        } finally {
            in.close();
        }

        new ClassDiagramVisitor().visit(compilationUnit, null);
    }
}

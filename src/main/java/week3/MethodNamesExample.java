package week3;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.sun.xml.internal.ws.encoding.fastinfoset.FastInfosetStreamReaderRecyclable;
import jdk.internal.org.objectweb.asm.MethodVisitor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodNamesExample {

    public static void main(String[] args) throws IOException {
//        String filename = "test.txt";
        String filename = "src/main/java/week3/MethodNamesExample.java";
        FileInputStream inputStream = new FileInputStream(filename);
        CompilationUnit compilationUnit = null;
        try {
            compilationUnit = StaticJavaParser.parse(inputStream);
        } catch (ParseProblemException e) {
            System.out.println("There was an error reading " + filename);
            System.exit(1);
        } finally {
            inputStream.close();
        }
        new MethodVisitor().visit(compilationUnit, null);
    }

    private static class MethodVisitor extends VoidVisitorAdapter {
        public void visit(MethodDeclaration methodDeclaration, Object arg){
            System.out.println("Found method: " + methodDeclaration.getName());
        }

        private int dummyMethod(){
            return 0;
        }
    }
}

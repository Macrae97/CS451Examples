package week3.example1;

import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class ClassDiagramVisitor extends VoidVisitorAdapter {

    public void visit(ClassOrInterfaceDeclaration classOrInterfaceDeclaration, Object arg){
        System.out.println("\nClass");
        System.out.println(" " + classOrInterfaceDeclaration.getNameAsString());

        List<ClassOrInterfaceType> implementedTypes = classOrInterfaceDeclaration.getImplementedTypes();
        if (!implementedTypes.isEmpty()){
            System.out.println("Implements:");
            for (ClassOrInterfaceType classOrInterfaceType : implementedTypes){
                System.out.println(" " + classOrInterfaceType.getNameAsString());
            }
        }

        List<ClassOrInterfaceType> extendedTypes = classOrInterfaceDeclaration.getExtendedTypes();
        if (!extendedTypes.isEmpty()){
            System.out.println("Extends:");
            for (ClassOrInterfaceType classOrInterfaceType : extendedTypes){
                System.out.println(" " + classOrInterfaceType.getNameAsString());
            }
        }

        super.visit(classOrInterfaceDeclaration, arg);
    }

    public void visit(FieldDeclaration fd, Object arg){
        System.out.println("\nFields");
        for (VariableDeclarator v : fd.getVariables()){
            System.out.println(v.getName() + " : " + v.getType());
        }
    }

    public void visit(MethodDeclaration md, Object arg){
        System.out.print("\nMethod ");
        System.out.print(md.getName() + "(");
        for (Parameter p : md.getParameters()){
            System.out.print(p.getName() + " : " + p.getType());
        }
        System.out.print(")");
    }
}

package week_7.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(0, 0, 50, 25);
        rect.move(10, 10);
        rect.draw();

        Shape circle = new Circle(0, 0, 25);
        circle.move(35, 35);
        circle.draw();

        List<Shape> children = new ArrayList<>();
        children.add(rect);
        children.add(circle);

        GroupShapes comp = new GroupShapes(children);
        System.out.println("------------------");
        System.out.println("Composite width and height");
        System.out.println(comp.width());
        System.out.println(comp.height());

        System.out.println("------------------");
        comp.move(10, 10);
        comp.draw();
        System.out.println("------------------");
        System.out.println("Composite width and height");
        System.out.println(comp.width());
        System.out.println(comp.height());
    }
}

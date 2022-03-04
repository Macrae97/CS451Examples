package week2.visitor.visitors;

import week2.visitor.elements.Body;
import week2.visitor.elements.Car;
import week2.visitor.elements.Engine;
import week2.visitor.elements.Wheel;

public class CarElementDoVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Starting my car");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }
}

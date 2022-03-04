package week2.visitor.visitors;

import week2.visitor.elements.Body;
import week2.visitor.elements.Car;
import week2.visitor.elements.Engine;
import week2.visitor.elements.Wheel;

public class SalesVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Car is of type " + body.getBodyType());
    }

    @Override
    public void visit(Car car) {

    }

    @Override
    public void visit(Engine engine) {
        System.out.println("This car has a " + engine.getEngineSize() + "L engine");
    }

    @Override
    public void visit(Wheel wheel) {

    }
}

package week2.visitor.visitors;

import week2.visitor.elements.Body;
import week2.visitor.elements.Car;
import week2.visitor.elements.Engine;
import week2.visitor.elements.Wheel;

public class MechanicVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
    }

    @Override
    public void visit(Car car) {
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Engine oil levels are " + engine.getOilLevel());
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Tyre pressure of the " + wheel.getName() + " is " + wheel.getTyrePressure() + "psi");
    }
}

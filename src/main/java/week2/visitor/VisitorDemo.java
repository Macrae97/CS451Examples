package week2.visitor;

import week2.visitor.elements.Car;
import week2.visitor.visitors.CarElementDoVisitor;
import week2.visitor.visitors.CarElementPrintVisitor;
import week2.visitor.visitors.MechanicVisitor;
import week2.visitor.visitors.SalesVisitor;

public class VisitorDemo {
    public static void main(final String[] args) {
        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
        car.accept(new MechanicVisitor());
        car.accept(new SalesVisitor());
    }
}

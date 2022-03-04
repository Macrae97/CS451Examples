package week2.visitor.visitors;

import week2.visitor.elements.Body;
import week2.visitor.elements.Car;
import week2.visitor.elements.Engine;
import week2.visitor.elements.Wheel;

public interface CarElementVisitor {
    void visit(Body body);
    void visit(Car car);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
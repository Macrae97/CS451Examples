package week2.visitor.elements;

import week2.visitor.visitors.CarElementVisitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}

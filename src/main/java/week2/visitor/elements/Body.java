package week2.visitor.elements;

import week2.visitor.visitors.CarElementVisitor;

public class Body implements CarElement {

    public enum Type {
        Saloon, Hatchback, Sports, Tourer, SUV;
    }
    private final Type bodyType;

    public Body(Type bodyType) {
        this.bodyType = bodyType;
    }

    public Type getBodyType() {
        return bodyType;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
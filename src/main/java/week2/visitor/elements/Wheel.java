package week2.visitor.elements;

import week2.visitor.visitors.CarElementVisitor;

public class Wheel implements CarElement {
    private final String name;
    private final int tyrePressure;

    public Wheel(final String name, int tyrePressure) {
        this.name = name;
        this.tyrePressure = tyrePressure;
    }

    public String getName() {
        return name;
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        /*
         * accept(CarElementVisitor) in Wheel implements
         * accept(CarElementVisitor) in CarElement, so the call
         * to accept is bound at run time. This can be considered
         * the *first* dispatch. However, the decision to call
         * visit(Wheel) (as opposed to visit(Engine) etc.) can be
         * made during compile time since 'this' is known at compile
         * time to be a Wheel. Moreover, each implementation of
         * CarElementVisitor implements the visit(Wheel), which is
         * another decision that is made at run time. This can be
         * considered the *second* dispatch.
         */
        visitor.visit(this);
    }
}
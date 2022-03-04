package week2.visitor.elements;

import week2.visitor.visitors.CarElementVisitor;

import java.util.ArrayList;
import java.util.List;

public   class Car implements CarElement {
    private final List<CarElement> elements;

    public Car() {
        this.elements = new ArrayList<>();
        elements.add(new Wheel("front left", 30));
        elements.add(new Wheel("front right", 33));
        elements.add(new Wheel("back left", 32));
        elements.add(new Wheel("back right", 33));
        elements.add(new Body(Body.Type.Sports));
        elements.add(new Engine(Engine.OilLevel.OKAY, "1.8"));
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}


package week2.visitor.elements;

import week2.visitor.visitors.CarElementVisitor;

public class Engine implements CarElement {

    public enum OilLevel{
        LOW, OKAY
    }

    private final OilLevel oilLevel;
    private final String engineSize;

    public Engine(OilLevel oilLevel, String engineSize) {
        this.oilLevel = oilLevel;
        this.engineSize = engineSize;
    }

    public OilLevel getOilLevel() {
        return oilLevel;
    }

    public String getEngineSize() {
        return engineSize;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
package week4;

abstract class MobilePhonePlan {
    protected double rate;
    abstract void setRate();

    public void calculateBill(int time){
        Double cost = time*rate;
        System.out.println("The bill for " + time + " minutes is £" + String.format("%.2f", cost));
        System.out.println();
    }

    public MobilePhonePlan(){
        System.out.println("Just created a " + this.getClass().getSimpleName() + " plan");
        setRate();
    }
}

class Residential extends MobilePhonePlan{
    public void setRate() {
        rate = 0.035;
    }
}

class Business extends MobilePhonePlan{
    public void setRate() {
        rate = 0.025;
    }
}
class Combined extends MobilePhonePlan{
    public void setRate() {
        rate = 0.015;
    }
}

//enum for concrete products
enum Customer {
    RESIDENTIAL,
    BUSINESS,
    COMBINED
}

class PlanFactory {
    public static MobilePhonePlan planFor(Customer c){
        switch (c){
            case BUSINESS:
                return new Business();
            case COMBINED:
                return new Combined();
            case RESIDENTIAL:
            default:
                return new Residential();
        }
    }
}
package week4;

public class Main {
    public static void main(String[] args) {
        MobilePhonePlan plan = PlanFactory.planFor(Customer.BUSINESS);
        plan.calculateBill(600);

        plan = PlanFactory.planFor(Customer.RESIDENTIAL);
        plan.calculateBill(600);

        plan = PlanFactory.planFor(Customer.COMBINED);
        plan.calculateBill(600);
    }
}

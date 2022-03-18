package week_7.template;

public class Main {
    public static void main(String[] args) {
        TemplateHouse house = new WoodenHouse();
        house.buildHouse();

        System.out.println("----------------------");
        house = new GlassHouse();
        house.buildHouse();
    }
}

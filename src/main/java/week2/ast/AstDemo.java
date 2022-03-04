package week2.ast;

public class AstDemo {

    public static void main(String[] args) {
        AoT aoT = new AoT();
        aoT.calcA(100, 3);
        System.out.println(aoT.getA());
    }
}

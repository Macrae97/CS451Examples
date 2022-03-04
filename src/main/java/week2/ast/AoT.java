package week2.ast;

public class AoT {

    private double a;

    public void calcA(int b, int h){
       a = b * h / 2.0;
    }

    public double getA(){
        return a;
    }
}

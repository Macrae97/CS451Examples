package week3.example2;

public class Test {

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println("main");
        System.out.println("main");
        System.out.println(f());
        System.out.println(g());
        h();
        i();
    }

    public static int f() {
        System.out.println("f");
        System.out.println("f");
        System.out.println("f");
        return 1;
    }

    public static String g() {
        System.out.println("g");
        System.out.println("g");
        System.out.println("g");
        return "a";
    }

    public static void h() {
        System.out.println("h");
        System.out.println("h");
        System.out.println("h");
        System.out.println("hello");
    }

    public static void i() {
        System.out.println("i");
        System.out.println("i");
        // I should be last... run me twice!
        System.out.println("i");
        System.out.println("Something weird will happen the the *trailing* comment in this method");
    }
    // anything weird happen here too?
}

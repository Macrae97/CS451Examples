package week_6.prototype;

public class Main {
    public static void main(String[] args) {
        Employee prototypeJunior = new JuniorDeveloper();
        Employee prototypeDeveloper = new Developer();
        Employee prototypeSenior = new SeniorDeveloper();

        Employee john = prototypeJunior.makeClone();
        john.setName("John");
        john.setAccountNumber("12345");

        Employee frank = john.makeClone();
        frank.setName("Frank");

        Employee jessica = prototypeDeveloper.makeClone();
        jessica.setName("Jessica");
        jessica.setAccountNumber("23456");

        Employee stuart = prototypeSenior.makeClone();
        stuart.setName("Stuart");
        stuart.setAccountNumber("34567");

        System.out.println(prototypeJunior);
        System.out.println(prototypeDeveloper);
        System.out.println(prototypeSenior);
        System.out.println();

        System.out.println(john);
        System.out.println(frank);
        System.out.println(jessica);
        System.out.println(stuart);
    }
}

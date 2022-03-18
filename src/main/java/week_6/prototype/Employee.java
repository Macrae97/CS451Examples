package week_6.prototype;

class Defaults {
    public final static String NAME = "Company & Co";
    public final static String ACCOUNT_NUMBER = "000000";
}

abstract class Employee {
    private String name;
    private double salary;
    private String accountNumber;

    protected Employee(double salary) {
        this.name = Defaults.NAME;
        this.salary = salary;
        this.accountNumber = Defaults.ACCOUNT_NUMBER;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "job='" + this.getClass().getSimpleName() + '\'' +
                ", salary=" + salary +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    abstract Employee makeClone();
}

class JuniorDeveloper extends Employee {
    public JuniorDeveloper(){super(20000);}

    public Employee makeClone() {
        return new JuniorDeveloper();
    }
}

class Developer extends Employee {
    public Developer(){super(30000);}

    public Employee makeClone() {
        return new Developer();
    }
}

class SeniorDeveloper extends Employee {
    public SeniorDeveloper(){super(40000);}

    public Employee makeClone() {
        return new SeniorDeveloper();
    }
}
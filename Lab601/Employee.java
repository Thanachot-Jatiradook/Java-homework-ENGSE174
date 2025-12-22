package Lab601;

public abstract class Employee {

    protected String name ;

    public Employee(String name) {

        this.name = name ;

    }

    public void displayInfo() {

        System.out.println("Employee name : " + this.name) ;

    }

    public abstract double calculatePay() ;
    
}

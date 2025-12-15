package Lab507;

public class SalesEmployee extends Employee {

    protected double commissionRate ;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {

        super(name, baseSalary) ;

        this.commissionRate = commissionRate ;

    }
    @Override
    public double calculatePay() {

        return baseSalary + (baseSalary * commissionRate) ;

    }
    
}

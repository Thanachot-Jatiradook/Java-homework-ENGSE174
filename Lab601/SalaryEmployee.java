package Lab601;

public class SalaryEmployee extends Employee {

    protected double monthlySalary ;

    public SalaryEmployee(String name, double monthlySalary) {

        super(name) ;   
        this.monthlySalary = monthlySalary ;

    }

    @Override
    public double calculatePay() {

        return monthlySalary ;
        
    }

}

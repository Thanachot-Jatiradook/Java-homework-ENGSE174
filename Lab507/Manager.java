package Lab507;

public class Manager extends Employee {

    protected double fixedBonus ;

    public Manager(String name, double baseSalary, double fixedBonus) {

        super(name, baseSalary) ;

        this.fixedBonus = fixedBonus ;

    }

    @Override
    public double calculatePay() {

        return baseSalary + fixedBonus ;

    }

}

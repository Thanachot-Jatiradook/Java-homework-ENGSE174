package Lab508;

public class Employee extends Person {

    protected double salary ;

    public Employee(String name, double salary) {

        super(name) ;
        this.salary = salary ;

    }

    public void applyBonus(double bonus) {

        this.salary += bonus ;

    }

    @Override
    public String getStatus() {

        return "Employee : " + name + ", Salary : " + salary ;

    }

}

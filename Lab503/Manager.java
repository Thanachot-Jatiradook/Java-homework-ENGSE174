package Lab503;

public class Manager extends Employee {

    @Override
    public double calculateBonus() {

        double normalBonus = super.calculateBonus() ;
        double moreBonus = salary * 0.05 ;

        return normalBonus + moreBonus ;
    }
    
}

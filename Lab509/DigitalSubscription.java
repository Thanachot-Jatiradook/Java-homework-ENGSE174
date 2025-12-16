package Lab509;

public class DigitalSubscription extends Item {

    protected double monthlyCost ;
    protected int months ;

    public DigitalSubscription(String name, double monthlyCost, int months) {

        super(name) ;
        this.monthlyCost = monthlyCost ;
        this.months = months ;
    }

    @Override
    public double getValue() {

        return monthlyCost * months ;

    }
    
}

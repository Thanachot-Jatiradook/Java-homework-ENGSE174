package Lab5010;

public class ComplexTask extends ProjectTask {

    protected double setupFee ;

    public ComplexTask(String desc, int hours, double setupFee) {

        super(desc, hours) ;
        this.setupFee = setupFee ;

    }

    @Override
    public double calculateCost() {

        return (super.calculateCost() * 1.10) + setupFee ;
        
    }

}

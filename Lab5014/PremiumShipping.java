package Lab5014;

public class PremiumShipping extends Shipping {

    protected double insuranceFee ;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {

        super(id, baseFee) ;
        this.insuranceFee = insuranceFee ;

    }

    @Override
    public double calculateTotalFee() {

        super.calculateTotalFee() ;

        return baseFee + insuranceFee ;

    }
    
}

package Lab5014;

public class StandardShipping extends Shipping {

    public StandardShipping(String id, double baseFee) {

        super(id, baseFee) ;

    }

    @Override
    public double calculateTotalFee() {

        return baseFee * 1.05 ;

    }
    
}

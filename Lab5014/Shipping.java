package Lab5014;

public class Shipping {
    protected String trackingId ;
    protected double baseFee ;

    public Shipping(String id, double baseFee) {

        this.trackingId = id ;
        this.baseFee = baseFee ;
    }

    public double calculateTotalFee() {

        return baseFee ;

    }
    
}

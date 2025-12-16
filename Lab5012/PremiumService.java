package Lab5012;

public class PremiumService extends Service {

    protected double premiumRate ;

    public PremiumService(String name, double basePrice, double premiumRate) {

        super(name, basePrice) ;
        this.premiumRate = premiumRate ;

    }

    @Override
    public double calculateFinalPrice() {

        return basePrice * (1 + premiumRate) ;
        
    }
    
}

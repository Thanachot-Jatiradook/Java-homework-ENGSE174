package Lab5012;

public class BasicService extends Service {

    public BasicService(String name, double basePrice) {
        
        super(name, basePrice) ;

    }

    @Override
    public double calculateFinalPrice() {

        return basePrice * 1.05 ;

    }
    
}

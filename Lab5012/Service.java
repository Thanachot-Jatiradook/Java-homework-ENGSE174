package Lab5012;

public class Service {

    protected String name ;
    protected double basePrice ;

    public Service(String name, double basePrice) {

        this.name = name ;
        this.basePrice = basePrice ;

    }

    public double calculateFinalPrice() {

        return this.basePrice ;

    }
    
}

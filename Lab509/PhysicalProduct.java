package Lab509;

public class PhysicalProduct extends Item {

    protected double unitPrice ;
    protected int quantity ;

    public PhysicalProduct(String name, double unitPrice, int quantity) {

        super(name) ;
        this.unitPrice = unitPrice ;
        this.quantity = quantity ;

    }

    @Override
    public double getValue() {

        return unitPrice * quantity ;

    }
    
}

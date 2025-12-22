package Lab603;

public abstract class Product implements ITaxable {

    protected String name ;
    protected double price ;

    public Product(String name, double price) {

        this.name = name ;
        this.price = price ;

    }

    public double calulateBasePrice() {

        return price ;

    }

    public abstract double calulateFinalPrice() ;

}

package Lab603;

public class Book extends Product {

    public Book(String name, double price) {

        super(name, price) ;

    }

    @Override
    public double getTaxRate() {

        return 0.07 ;

    }

    @Override
    public double calulateFinalPrice() {

        double baseprice = calulateBasePrice() ;
        return baseprice + (baseprice * getTaxRate()) ;

    }
    
}

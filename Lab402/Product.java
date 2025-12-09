package Lab402;

public class Product {
    private String name ;
    private double price ;

    public Product(String name) {

        this(name, 0.0);

    }

    public Product(String name, double price) {

        this.name = name ;
        this.price = price ;

    }

    public void displayInfo() {

        System.out.println("Product :     " + name + ", Price :     " + price) ;

    }

}

package Lab2010;

public class ShoppingCart {

    Product[] items = new Product[10] ;
    int itemCount = 0 ;

    public void addProduct(Product p) {

        if (itemCount < items.length) {
            items[itemCount] = p ;
            itemCount++ ;

        }
            else {

                System.out.println("Too much items (Max size is 10)") ;

            }

    }

    public double calculateTotalPrice() {

        double total = 0.0 ;

        for (int i = 0; i < itemCount; i++) {
            
            total += items[i].price ;
            
        }

        return total ;

    }

}

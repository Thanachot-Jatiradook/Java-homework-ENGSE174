package Lab308;

public class InventoryItem {

    private String productName ;
    private int stock ;

    public InventoryItem(String productName, int initialStock) {

        this.productName = productName;

        if (initialStock >= 0) {

            this.stock = initialStock ;

        }

        else {

            this.stock = 0 ;

        }

    }

    public String getProductName() {

        return this.productName ;

    }

    public int getStock() {

        return this.stock ;

    }

    public void addStock(int amount) {

        System.out.println("----------result----------");

        if (amount > 0) {

                this.stock += amount ;
                System.out.println("Stock added") ;

        }

        else {

            System.out.println("Invalid amount") ;

        }

        System.out.println("--------------------------");

    }

    public void sellStock(int amount) {

        System.out.println("----------result----------");

        if (amount > 0 && amount <= this.stock) {

            this.stock -= amount ;
            System.out.println("Sale succesful") ;

        }

        else if(amount > this.stock) {

            System.out.println("Not enough stock") ;

        }

        else {
            System.out.println("Invalid amount") ;

        }

        System.out.println("--------------------------");

    }

}

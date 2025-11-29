package Lab2010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int N = 0 ;

        while (true) {

            System.out.println("Enter Your Amount Of Product :     ") ;
            N = scanner.nextInt() ;

            if (N > 10) {

                System.out.println("Too Much Produtct (Max size is 10)") ;

            }
                else {

                    break ;

                }

        }

        ShoppingCart cart = new ShoppingCart() ;

        scanner.nextLine();

        for (int i = 0; i < N; i++){

            System.out.println("------------------------");

            System.out.println("items" + (i + 1));

            System.out.println("Enter Your Product Name :     ");
            String name = scanner.nextLine();

            System.out.println("Enter Your Product Price :     ");
            double price = scanner.nextDouble();

            scanner.nextLine();

            Product p = new Product(name, price);
            cart.addProduct(p);
        }

        double lasttotal = cart.calculateTotalPrice();
        System.out.println("----------result----------");
        System.out.println("Total Price :     " + lasttotal);

        scanner.close();
        
    }

}

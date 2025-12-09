package Lab402;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("1 Or 2 :     ") ;
        int mode = scanner.nextInt() ;

        scanner.nextLine() ;

        System.out.println("----------------------------------------------");

        Product product = null ;

        if (mode ==1) {

            System.out.println("Enter Your Product Name :     ") ;
            String inputName = scanner.nextLine() ;

            product = new Product(inputName) ;
        }
        else if (mode == 2) {

            System.out.println("Enter Your Product Name :     ") ;
            String inputName = scanner.nextLine() ;

            System.out.println("Enter Your Product Price :     ") ;
            double inputPrice = scanner.nextDouble() ;

            product = new Product(inputName, inputPrice) ;
            
        }

        System.out.println("--------------------result--------------------");

        if (product != null) {

            product.displayInfo() ;

        }

        scanner.close() ;

    }
    
}

package Lab308;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Product Name:     ") ;
        String inputProductName = scanner.nextLine() ;

        System.out.println("Enter Your Stock :     ") ;
        int inputInitialStock = scanner.nextInt() ;

        InventoryItem blehitem = new InventoryItem(inputProductName, inputInitialStock) ;

        System.out.println("Enter Your object :     ") ;
        int n = scanner.nextInt() ;

        for (int i = 0; i < n; i++) {

            String command = scanner.next() ;
            int amount = scanner.nextInt() ;

            if (command.equals("ADD")) {

                blehitem.addStock(amount) ;

            }
            else if (command.equals("SELL")) {

                blehitem.sellStock(amount) ;

            }

        }

        System.out.println("Final Stock :     " + blehitem.getStock()) ;

        scanner.close() ;

    }

}

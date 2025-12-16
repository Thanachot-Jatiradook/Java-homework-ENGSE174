package Lab509;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Product : ") ;
        String inputProductName = scanner.nextLine() ;

        System.out.println("-------------------------");

        System.out.println("Price : ") ;
        double inputUnitPrice = scanner.nextDouble(); 

        System.out.println("-------------------------");

        System.out.println("Quantity : ") ;
        int inputQuantity = scanner.nextInt() ;

        System.out.println("-------------------------");

        scanner.nextLine() ;

        System.out.println("Plan : ") ;
        String inputPlan = scanner.nextLine() ;

        System.out.println("-------------------------");

        System.out.println("Monthly cost : ") ;
        double inputMonthlyCost = scanner.nextDouble() ;

        System.out.println("-------------------------");

        System.out.println("Months : ") ;
        int inputMonths = scanner.nextInt() ;

        System.out.println("----------result----------");

        PhysicalProduct blePhysicalProduct = new PhysicalProduct(inputProductName, inputUnitPrice, inputQuantity) ;
        DigitalSubscription blehDigitalSubscription = new DigitalSubscription(inputPlan, inputMonthlyCost, inputMonths) ;

        Item[] blehItems = new Item[2] ;

        blehItems[0] = blePhysicalProduct ;
        blehItems[1] = blehDigitalSubscription ;

        double totalValue = 0.0 ;

        for (Item i : blehItems) {

            double value = i.getValue() ;
            totalValue += value;

        }

        System.out.println("Total : " + totalValue) ;

        scanner.close();

    }

}

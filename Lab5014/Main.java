package Lab5014;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Standard id : ") ;
        String inputStandardId = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Fee : ") ;
        double inputStandardFee = scanner.nextDouble() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Premium id : ") ;
        String inputPremiumId = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Fee : ") ;
        double inputPremiumFee = scanner.nextDouble() ;

        System.out.println("--------------------------");

        System.out.println("Insurance fee : ") ;
        double inputInsuranceFee = scanner.nextDouble() ;

        System.out.println("----------result----------");

        StandardShipping standard = new StandardShipping(inputStandardId, inputStandardFee) ;
        PremiumShipping premium = new PremiumShipping(inputPremiumId, inputPremiumFee, inputInsuranceFee) ;

        Shipping[] shippings = new Shipping[2] ;

        shippings[0] = standard ;
        shippings[1] = premium ;

        for (Shipping s : shippings) {

            System.out.println(s.calculateTotalFee()) ;

        }

        scanner.close();

    }

}

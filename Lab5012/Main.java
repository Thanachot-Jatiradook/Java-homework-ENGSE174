package Lab5012;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Basic service name : ") ;
        String inputBasicName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Price : ") ;
        double inputBasicPrice = scanner.nextDouble() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Premium service name : ") ;
        String inputPremiumName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Price : ") ;
        double inputPremiumPrice = scanner.nextDouble() ;

        System.out.println("--------------------------");

        System.out.println("Rate : ") ;
        double inputRate = scanner.nextDouble() ;

        System.out.println("----------result----------");

        BasicService blehBasicService = new BasicService(inputBasicName, inputBasicPrice) ;
        PremiumService blehPremiumService = new PremiumService(inputPremiumName, inputPremiumPrice, inputRate) ;

        Service[] blehServices = new Service[2] ;

        blehServices[0] = blehBasicService ;
        blehServices[1] = blehPremiumService ;

        for (Service s : blehServices) {

            System.out.println(s.calculateFinalPrice()) ;

        }

        scanner.close(); 

    }

}

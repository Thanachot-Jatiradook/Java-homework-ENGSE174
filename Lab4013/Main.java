package Lab4013;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Ente Max Duration For Policy : ") ;
        int inputMaxPolicy = scanner.nextInt() ;

        Subscription.setMaxDuration(inputMaxPolicy) ;

        scanner.nextLine() ; 

        System.out.println("--------------------------");

        System.out.println("Enter Your Plan : ") ;
        String inputPlanName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("How Long For Your Plan : ") ; 
        int inputDays = scanner.nextInt() ;

        Subscription blehsub1 = new Subscription(inputPlanName, inputDays) ;

        System.out.println("--------------------------");

        System.out.println("How Long You Want To Extend ? : ") ;
        int inputExtend = scanner.nextInt() ;

        Subscription blehsub2 = blehsub1.extend(inputExtend) ;

        if (blehsub2 != blehsub1) {

            System.out.println("Extension successful") ;

            blehsub1 = blehsub2 ;

        }

        System.out.println("--------------------------");

        System.out.println("How Long You Want To Extend ? : ") ; 
        int inputExtend2 = scanner.nextInt() ;

        Subscription blehsub3 = blehsub1.extend(inputExtend2) ;

        if (blehsub3 != blehsub1) {

            System.out.println("Extension successful") ;

            blehsub1 = blehsub3 ;

        }

        System.out.println("----------result----------");

        blehsub1.displayInfo() ;

        scanner.close();

    }

}

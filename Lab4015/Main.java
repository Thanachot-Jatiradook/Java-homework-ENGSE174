package Lab4015;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Maximum of Your Policy : ") ;
        int inputMax = scanner.nextInt() ;

        AuditRecord.setPolicy(inputMax) ;

        scanner.nextLine() ;

        System.out.println("-------------------------") ;

        System.out.println("Enter Your Name : ") ;
        String inputName = scanner.nextLine() ;

        AuditRecord blehrecord = new AuditRecord(inputName) ;

        System.out.println("-------------------------") ;

        System.out.println("Enter Amount Of Your Log Message : ") ;
        int n = scanner.nextInt() ;

        scanner.nextLine() ;

        System.out.println("-------------------------") ;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Your Log Messgae : ") ;
            String blehmessage = scanner.nextLine() ;

            blehrecord = blehrecord.addMessage(blehmessage) ;

            System.out.println("-------------------------") ;

        }

        blehrecord.displayLog() ;

        scanner.close();

    }

}

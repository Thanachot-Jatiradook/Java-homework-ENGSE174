package Lab606;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Email recipient : ") ;
        String recipient1 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Email message : ") ;
        String message1 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("SMS recipient : ") ;
        String recipient2 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("SMS message : ") ;
        String message2 = scanner.nextLine() ;

        System.out.println("----------result----------");

        EmailSender blehEmailSender = new EmailSender() ;
        SMSSender blehSmsSender = new SMSSender() ;

        Notifier blehNotifier1 = new Notifier(blehEmailSender) ;
        blehNotifier1.sendNotification(recipient1, message1) ;

        Notifier blehNotifier2 = new Notifier(blehSmsSender) ;
        blehNotifier2.sendNotification(recipient2, message2) ;

        scanner.close() ;

    }
    
}

package Lab605;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Recipient : ") ;
        String inputRecipient = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Message : ") ;
        String inputMessage = scanner.nextLine() ;

        System.out.println("----------result----------");

        EmailSender blehEmailSender = new EmailSender() ;
        Notifier blehNotifier = new Notifier(blehEmailSender) ;

        blehNotifier.sendNotification(inputRecipient, inputMessage) ;

        scanner.close();

    }

}

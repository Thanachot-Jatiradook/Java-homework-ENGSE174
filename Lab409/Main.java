package Lab409;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Account ID : ") ;
        String inputAccountId = scanner.nextLine() ;

        System.out.println("Enter Your Balance : ") ;
        double inputBalance = scanner.nextDouble() ;

        System.out.println("Enter Your Deposit Amount : ") ;
        double inputDeposit = scanner.nextDouble() ;

        System.out.println("Enter Your Withdrawal Amount : ") ;
        double inputWithDrawal = scanner.nextDouble() ;

        System.out.println("----------result----------");

        ImmutableAccount acc1 = new ImmutableAccount(inputAccountId, inputBalance) ;
        ImmutableAccount acc2 = acc1.deposit(inputDeposit) ;
        ImmutableAccount acc3 = acc2.withdraw(inputWithDrawal) ;

        acc1.displayInfo() ;
        acc3.displayInfo() ;

        scanner.close();

    }

}

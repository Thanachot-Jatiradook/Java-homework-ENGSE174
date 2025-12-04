package Lab3014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        BankAccount myAccount = null;

        System.out.println("Enter Your Amount Of Your Command :     ");

        if (scanner.hasNextInt()) {

            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                System.out.println("Enter Your Command :     ");
                String command = scanner.next() ;

                if (command.equals("CREATE")) {

                    System.out.println("Enter Amount Of Monney :     ");
                    double initial = scanner.nextDouble() ;
                    myAccount = new BankAccount(initial) ;

                    System.out.println("--------------------------");

                }

                else if (command.equals("DEPOSIT")) {

                    System.out.println("Enter Amount Of Monney :     ");
                    double amount = scanner.nextDouble() ;

                    if (myAccount == null) {

                        System.out.println("No Account Exits") ;

                    }

                    else {

                        myAccount.deposit(amount) ;

                    }

                    System.out.println("--------------------------");

                }

                else if (command.equals("WITHDRAW")) {

                    System.out.println("Enter Amount Of Monney :     ");
                    double amount = scanner.nextDouble() ;

                    if (myAccount == null) {

                        System.out.println("No Account Exits") ;

                    }

                    else {

                        myAccount.withdraw(amount) ;

                    }

                    System.out.println("--------------------------");

                }

                else if(command.equals("STATUS")) {

                    if (myAccount == null) {

                        System.out.println("No Account Exits") ;

                    }

                    else {

                        System.out.println("Balance :     " + myAccount.getBalance()) ;

                    }

                    System.out.println("--------------------------");
                    
                }

                else if (command.equals("GLOBAL_STATUS")) {

                    System.out.println("----------result----------");
                    System.out.println("Total Transactions :     " + BankAccount.getTotalTransactionCount()) ;

                }

            }

        }

        scanner.close();

    }
    
}

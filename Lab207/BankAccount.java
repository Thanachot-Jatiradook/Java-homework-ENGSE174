package Lab207 ;

import java.util.Scanner;

public class BankAccount {
    
    private String ownerName ;
    private double balance ;

    public BankAccount(String oname, double mbalance) {

        this.ownerName = oname ;
        this.balance = mbalance ;

    }

    public void withdraw(double amount) {
        

        if (amount <= this.balance) {

            this.balance -= amount ;
            System.out.println("Withdrawal successful") ;
        }

        else {
            
            System.out.println("Insufficient funds") ;

        }
    }

    public void displayBalance() {

        System.out.println("-----Result-----") ;
        System.out.println("Balance :     " + this.balance) ;

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Name :   ") ;
        String inputOname = scanner.nextLine() ;

        System.out.println("Enter Your Balance :   ") ;
        double inputMbalance = scanner.nextDouble() ;

        System.out.println("Enter Your First Withdraw :     ") ;
        Double firstWithdraw = scanner.nextDouble() ;

        System.out.println("Enter Your Second Withdraw :     ") ;
        Double SecondWithdraw = scanner.nextDouble() ;

        BankAccount blehAccount = new BankAccount(inputOname, inputMbalance) ; 

        blehAccount.withdraw(firstWithdraw) ;
        blehAccount.withdraw(SecondWithdraw) ;

        blehAccount.displayBalance() ;

        scanner.close(); 

    }

}

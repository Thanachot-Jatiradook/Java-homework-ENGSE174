package Lab3014;

public class BankAccount {

    private double balance ;
    private static int totalTransactionCount = 0 ;

    public BankAccount (double initialDeposit) {

        if (initialDeposit >= 0) {

            this.balance = initialDeposit ;

        }

        else {

            this.balance = 0 ;

        }

        System.out.println("Account Created") ;

    }

    public void deposit(double amount) {

        if (amount > 0) {

            this.balance += amount ;
            totalTransactionCount++ ;
            System.out.println("Deposit Successful") ;

        }

        else {

            System.out.println("Invalid Amount") ;

        }

    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= this.balance) {

            this.balance -= amount ;
            totalTransactionCount++ ;
            System.out.println("Withdraw Successful") ;

        }

        else if (amount > this.balance) {

            System.out.println("Insufficient Funds") ;

        }

        else {

            System.out.println("Invalid Amount") ;

        }

    }

    public double getBalance() {

        return this.balance ;

    }

    public static int getTotalTransactionCount() {

        return totalTransactionCount ;

    }
    
}


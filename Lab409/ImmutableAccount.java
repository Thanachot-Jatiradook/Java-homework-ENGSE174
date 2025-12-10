package Lab409;

public class ImmutableAccount {
    private String accountId;
    private double balance;

    public ImmutableAccount(String accountId, double balance) {

        this.accountId = accountId ;

        if (balance < 0) {

            this.balance = 0.0 ;

        }

        else {

            this.balance = balance ;

        }
 
    }

    public ImmutableAccount(ImmutableAccount other) {

        this.accountId = other.accountId;
        this.balance = other.balance;

    }

    public String getAccountId() {

        return accountId ;

    }

    public double getBalance() {

        return balance ;

    }

    public ImmutableAccount deposit(double amount) {

        if (amount > 0) {

            return new ImmutableAccount(this.accountId, this.balance + amount) ;

        }

        else {

            System.out.println("Invalid deposit amount") ;
            return this ;

        }

    }

    public ImmutableAccount withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            return new ImmutableAccount(this.accountId, this.balance - amount) ;

        }

        else if (amount > balance) {

            System.out.println("Insufficient funds") ;
            return this ;

        }

        else {

            System.out.println("Invalid withdrawal amount") ;
            return this ;

        }

    }

    public void displayInfo(){

        System.out.println("ID : " + this.accountId + ", Balance :" + this.balance) ;

    }

}

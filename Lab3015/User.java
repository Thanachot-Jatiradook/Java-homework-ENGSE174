package Lab3015;

public class User {

    private String username ;
    private int failedAttempts ;
    private boolean isLocked ;
    private static int maxAttempts = 3 ;

    public User(String username) {

        this.username = username ;
        failedAttempts = 0 ;
        isLocked = false ;

    }

    public static void setPolicy(int max) {

        if (max > 0) {
            maxAttempts = max ;
            System.out.println("Policy Updated") ;
        }

        else {

            System.out.println("Invalid Policy") ;

        }

    }

    public String getUsername() {

        return this.username ;

    }

    public boolean isLocked() {

        return isLocked ;

    }

    public int getFailedAttempts() {
        
        return failedAttempts ;

    }

    public void login(String password) {

        if (isLocked) {

            System.out.println("Account Is Locked") ;
            return;

        }

        if (password.equals("pass123")) {

            failedAttempts = 0 ;
            System.out.println("Login Successful") ;

        }

        else {
            failedAttempts++ ;

            if (failedAttempts >= maxAttempts) {

                isLocked = true ;
                System.out.println("Login Failed. Account Locked") ;

            }

            else {

                int remaining = maxAttempts - failedAttempts ;
                System.out.println("Login Failed" + remaining + "Attempts Left") ;

            }

        }
        
    }

}

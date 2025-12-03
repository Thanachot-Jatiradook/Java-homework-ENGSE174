package Lab309;

public class User {

    private String username ;
    private String password ;
    private static int minPasswordLength = 8 ;

    public User(String username, String password) {

        this.username = username ;

        if (password.length() >= minPasswordLength) {

            this.password = password ;
            System.out.println("Creation Successful") ;

        }

        else {

            this.password = "invalid" ;
            System.out.println("Creation Failed") ;

        }

    }

    public String getPassword() {

        return this.password ;

    }

    public void setPassword(String newPassword) {

        if (newPassword.length() >= minPasswordLength) {

            this.password = newPassword ;
            System.out.println("Update Successful") ;

        }

        else {
            System.out.println("Update Failed") ;

        }

    }

    public static void setMinLength(int length) {

        if (length < 4) {

            System.out.println("Invalid Length") ;

        }

        else {

            minPasswordLength = length ;
            System.out.println("New Min Length Set To " + length) ;

        }

    }

    public static int getMinLength() {

        return minPasswordLength ;

    }
    
}

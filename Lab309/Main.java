package Lab309;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        
        System.out.println("Enter Your Product Length :     ") ;
        int inputMinLength1 = scanner.nextInt() ;

        scanner.nextLine() ;

        String inputUserName1 = scanner.nextLine() ;
        String inputUserPassword1 = scanner.nextLine() ;
        String inputUserName2 = scanner.nextLine() ;
        String inputUserPassword2 = scanner.nextLine() ;

        int inputMinLength2 = scanner.nextInt() ;

        scanner.nextLine() ;
        
        String inputUserNewPassword2 = scanner.nextLine() ;

        User.setMinLength(inputMinLength1) ;

        User userno1 = new User(inputUserName1, inputUserPassword1) ;
        User userno2 = new User(inputUserName2, inputUserPassword2) ;

        User.setMinLength(inputMinLength2) ;

        userno2.setPassword(inputUserNewPassword2) ;

        System.out.println(userno1.getPassword()) ;
        System.out.println(userno2.getPassword()) ;

        scanner.close() ;

    }
}

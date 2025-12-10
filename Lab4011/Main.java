package Lab4011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Theme : ") ;
        String inputBaseTheme = scanner.nextLine() ;

        System.out.println("Enter Your Fontsize : ") ;
        int inputBaseFont = scanner.nextInt() ;

        System.out.println("Is this DarkMode? : ") ;
        Boolean inputBaseDarkTheme = scanner.nextBoolean() ;

        scanner.nextLine() ;

        System.out.println("-------------------------");

        System.out.println("Enter Your Theme : ") ;
        String inputUserTheme = scanner.nextLine() ;

        System.out.println("Enter Your Font : ") ;
        int inputUserFont = scanner.nextInt() ;

        System.out.println("Is this DarkMode? : ") ; 
        Boolean inputUserDarkTheme = scanner.nextBoolean() ;

        Configuration baseConfig = new Configuration(inputBaseTheme, inputBaseFont, inputBaseDarkTheme) ; 
        Configuration userConig = new Configuration(inputUserTheme, inputUserFont, inputUserDarkTheme) ;

        Configuration blehConfig = new Configuration(baseConfig, userConig) ;

        System.out.println("----------result----------");

        blehConfig.displaySettings() ;

        scanner.close() ;

    }

}

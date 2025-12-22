package Lab604;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Default profile : ") ;
        String inputDefaultProfile = scanner.nextLine() ;

        System.out.println("--------------------------") ;

        System.out.println("User ID : ") ;
        String inputID = scanner.nextLine() ;

        System.out.println("----------result----------") ;

        DefaultLoader blehDefaultLoader = new DefaultLoader(inputDefaultProfile) ;
        UserLoader blehUserLoader = new UserLoader(inputID) ;

        IConfigLoader[] blehIConfigLoaders = new IConfigLoader[2] ;

        blehIConfigLoaders[0] = blehDefaultLoader ;
        blehIConfigLoaders[1] = blehUserLoader ;

        for (IConfigLoader l : blehIConfigLoaders) {

            l.loadConfig() ;

        }

        scanner.close(); 

    }
    
}

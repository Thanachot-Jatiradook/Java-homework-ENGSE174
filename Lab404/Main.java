package Lab404;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Latitude :     ") ;
        double inputLatitude = scanner.nextDouble() ;

        System.out.println("Enter Longitude :     ") ;
        double inputLongitude = scanner.nextDouble() ;

        System.out.println("Enter New Latitude :     ") ;
        double inputNewLat = scanner.nextDouble() ;

        Location loc1 = new Location(inputLatitude, inputLongitude) ;
        Location loc2 = new Location(loc1) ;

        loc1.setLatitude(inputNewLat) ;

        System.out.println("----------result----------") ;

        loc1.displayInfo() ;
        loc2.displayInfo() ;

        scanner.close();

    }
    
}

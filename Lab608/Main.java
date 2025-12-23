package Lab608;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Solar panel name 1 : ") ;
        String name1 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Solar panel base power 1 : ") ;
        double basePower1 = scanner.nextDouble() ;

        System.out.println("--------------------------");

        System.out.println("Solar panel hours 1 : ") ;
        int hours1 = scanner.nextInt() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Solar panel name 2 : ") ;
        String name2 = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Solar panel base power 2 : ") ;
        double basePower2 = scanner.nextDouble() ;

        System.out.println("--------------------------");

        System.out.println("Solar panel hours 2 : ") ;
        int hours2 = scanner.nextInt() ;

        System.out.println("-----------result----------");

        SolarPanel p1 = new SolarPanel(name1, basePower1, hours1) ;
        SolarPanel p2 = new SolarPanel(name2, basePower2, hours2) ;

        p1.increaseUsage(100) ;

        PowerGenerator[] blehPowerGenerators = new PowerGenerator[2] ;

        blehPowerGenerators[0] = p1 ;
        blehPowerGenerators[1] = p2 ;

        for (PowerGenerator p : blehPowerGenerators) {

            if (p instanceof SolarPanel) {

                SolarPanel s = (SolarPanel) p ;
                System.out.println(s.calculateOutput()) ;

            }

        }

        scanner.close();

    }

}

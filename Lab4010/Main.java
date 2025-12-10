package Lab4010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("1 Or 2 : ") ;
        int mode = scanner.nextInt() ;

        TimePeriod blehtime = null ;

        if (mode == 1) {

            blehtime = new TimePeriod() ;

        }

        else if (mode == 2) {

            System.out.println("-------------------------") ;

            System.out.println("Enter Your Start Time : ") ;
            int inputStartHour = scanner.nextInt() ;

            System.out.println("Enter Your End Time : ") ;
            int inputEndHour = scanner.nextInt() ;

            blehtime = new TimePeriod(inputStartHour, inputEndHour) ;

        }

        System.out.println("----------result----------");

        if (blehtime != null) {

            blehtime.displayPeriod() ;

        }

        scanner.close();

    }

}

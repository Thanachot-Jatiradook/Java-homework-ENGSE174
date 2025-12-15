package Lab504;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Color : ") ;
        String inputColor = scanner.nextLine() ;

        System.out.println("-------------------------") ;

        System.out.println("Wheels : ") ;
        int inputWheels = scanner.nextInt() ;

        Car blehcCar = new Car(inputColor, inputWheels) ;

        System.out.println("----------result----------") ;

        blehcCar.displayDetails() ;

        scanner.close();

    }
    
}

package Lab5015;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Car model : ") ;
        String inputCarModel = scanner.nextLine() ;

        System.out.println("------------------------------") ;

        System.out.println("Rental rate : ") ;
        double inputCarRentalRate = scanner.nextDouble() ;

        System.out.println("------------------------------") ;

        scanner.nextLine() ;

        System.out.println("Motorcycle model : ") ;
        String inputMotorcycleModel = scanner.nextLine() ;

        System.out.println("------------------------------") ;

        System.out.println("Rental rate : ") ;
        double inputMotorcycleRentalRate = scanner.nextDouble() ;

        System.out.println("------------result------------") ;

        Car blehCar = new Car(inputCarModel, inputCarRentalRate);
        Motorcycle blehMotorcycle = new Motorcycle(inputMotorcycleModel, inputMotorcycleRentalRate) ;

        RentalVehicle[] rentalVehicles = new RentalVehicle[2] ;

        rentalVehicles[0] = blehCar ;
        rentalVehicles[1] = blehMotorcycle ;

        double totalRentalFee = 0 ;

        for (RentalVehicle r : rentalVehicles) {

            double fee = r.calculateFee() ;
            totalRentalFee += fee ;

        }

        System.out.println(totalRentalFee) ; 

        scanner.close();

    }

}

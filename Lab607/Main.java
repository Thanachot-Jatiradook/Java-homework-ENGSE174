package Lab607;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Truck speed : ") ;
        int speed = scanner.nextInt() ;

        System.out.println("--------------------------");

        System.out.println("Truck cargo weight : ") ;
        int cargoWeight = scanner.nextInt() ;

        System.out.println("----------result----------");

        Truck blehTruck = new Truck(speed, cargoWeight) ;

        blehTruck.displaySpeed() ;
        blehTruck.startEngine() ;

        scanner.close() ;

    }

}

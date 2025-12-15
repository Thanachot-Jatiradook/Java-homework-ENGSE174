package Lab502;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Name : ") ;
        String inputName = scanner.nextLine() ;

        System.out.println("--------------------------") ;

        System.out.println("Age : ") ;
        int inputAge = scanner.nextInt() ;

        Cat blehCat = new Cat() ;

        blehCat.name = inputName ;
        blehCat.age = inputAge ;

        System.out.println("----------result----------") ;

        blehCat.displayInfo() ;
        blehCat.makeSound() ;

        scanner.close();

    }
    
}

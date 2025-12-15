package Lab501;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Name : ") ;
        String inputName = scanner.nextLine() ;

        System.out.println("Age : ") ;
        int inputAge = scanner.nextInt() ;

        Dog blehDog = new Dog() ;

        blehDog.name = inputName ;
        blehDog.age = inputAge ;

        blehDog.makeSound() ;

        blehDog.displayInfo() ;

        scanner.close() ;
    }
    
}

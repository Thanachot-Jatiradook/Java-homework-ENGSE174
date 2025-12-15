package Lab503;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Salary : ") ;
        double inputSalary = scanner.nextDouble() ;

        Manager blehManager = new Manager() ;

        blehManager.salary = inputSalary ;

        double bonus = blehManager.calculateBonus() ;

        System.out.println("---------result----------") ;
        
        System.out.println("Manager Salary : " + bonus) ;

        scanner.close();

    }
    
}

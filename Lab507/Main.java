package Lab507;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Sales Name : ") ;
        String inputSalesName = scanner.nextLine() ;

        System.out.println("-------------------------");

        System.out.println("Salary : ") ;
        double inputSalesSalary = scanner.nextDouble() ;

        System.out.println("-------------------------");

        System.out.println("Commission rate : ") ;
        double inputSalesRate = scanner.nextDouble() ;

        System.out.println("-------------------------");

        scanner.nextLine() ;

        System.out.println("Manager Name : ") ;
        String inputManagerName = scanner.nextLine() ;

        System.out.println("-------------------------");

        System.out.println("Salary : ") ;
        double inputManagerSalary = scanner.nextDouble() ;

        System.out.println("-------------------------");

        System.out.println("Bonus : ") ;
        double inputManagerRate = scanner.nextDouble() ;

        SalesEmployee blehSalesEmployee = new SalesEmployee(inputSalesName, inputSalesSalary, inputSalesRate) ;
        Manager blehManager = new Manager(inputManagerName, inputManagerSalary, inputManagerRate) ;

        System.out.println("----------result----------");

        PayrollProcessor.process(blehSalesEmployee) ;
        PayrollProcessor.process(blehManager) ;

        scanner.close();

    }

}

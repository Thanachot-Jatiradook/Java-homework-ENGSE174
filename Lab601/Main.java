package Lab601;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        
        System.out.println("Employee name : ") ;
        String inputEmployeeName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Employee salary : ") ;
        double inputEmployeeSalary = scanner.nextDouble() ;

        System.out.println("----------result----------");

        SalaryEmployee blehSalaryEmployee = new SalaryEmployee(inputEmployeeName, inputEmployeeSalary) ;

        blehSalaryEmployee.displayInfo() ;

        double result = blehSalaryEmployee.calculatePay() ;
        System.out.println(result) ;

        scanner.close();

    }

}

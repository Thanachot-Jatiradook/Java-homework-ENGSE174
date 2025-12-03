package Lab3012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name :     ");
        String inputEname = scanner.nextLine();

        System.out.println("Enter Your Monthly Salary :     ");
        double inputMonthlySalary = scanner.nextDouble();

        System.out.println("Enter Tax Rate :     ");
        double inputTaxRate = scanner.nextDouble();

        System.out.println("Enter Raise Amount :     ");
        double inputRaiseAmount = scanner.nextDouble();

        Employee blehEmployee = new Employee(inputEname, inputMonthlySalary);

        System.out.println("----------result----------");

        System.out.println("Tax (Before) :     " + blehEmployee.calculateTax(inputTaxRate));

        blehEmployee.giveRaise(inputRaiseAmount);

        System.out.println("Tax (After) :     " + blehEmployee.calculateTax(inputTaxRate));

        scanner.close();
    }
}

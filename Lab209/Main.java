package Lab209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name :     ");
        String inputName = scanner.nextLine();
        System.out.println("Enter Your Street :     ");
        String inputStreet = scanner.nextLine();
        System.out.println("Enter Your City :     ");
        String inputCity = scanner.nextLine();
        System.out.println("Enter Your Zipcode :     ");
        String inputZipCode = scanner.nextLine();

        System.out.println("----------result----------");

        Address blehAddress = new Address(inputStreet, inputCity, inputZipCode);

        Student blehStudent = new Student(inputName, blehAddress);

        blehStudent.displayProfile();

        scanner.close();
    }
}

package Lab407;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your ID 1 : ");
        String inputId1 = scanner.nextLine();
        System.out.println("Enter Your ID 2 : ");
        String inputId2 = scanner.nextLine();
        System.out.println("Enter Your ID 3 : ");
        String inputId3 = scanner.nextLine();

        Resource r1 = new Resource(inputId1);
        Resource r2 = new Resource(inputId2);
        Resource r3 = new Resource(inputId3);

        r1 = null;
        r2 = null;

        System.gc();

        r3 = null;

        System.gc();

        scanner.close();
    }
}

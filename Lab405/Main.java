package Lab405;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RED :     ");
        int inputRed = scanner.nextInt();

        System.out.println("Green :     ");
        int inputGreen = scanner.nextInt();

        System.out.println("Blue :     ");
        int inputBlue = scanner.nextInt();

        Color gay = new Color(inputRed, inputGreen, inputBlue);

        gay.diaplayRGB();

        scanner.close();
    }
}

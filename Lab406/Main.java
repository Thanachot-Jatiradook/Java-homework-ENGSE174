package Lab406;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X :     ");
        int inputX = scanner.nextInt();

        System.out.println("Y :     ");
        int inputY = scanner.nextInt();

        System.out.println("DX :     ");
        int inputDx = scanner.nextInt();

        System.out.println("DY :     ");
        int inputDy = scanner.nextInt();

        System.out.println("----------result----------");

        Point p1 = new Point(inputX, inputY);
        Point p2 = p1.move(inputDx, inputDy);
        Point p3 = p2.move(inputDx, inputDy);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        scanner.close();
    }
}

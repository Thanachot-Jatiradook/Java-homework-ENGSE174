import java.util.Scanner;

public class Lab107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your range: ");
        int range = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter " + range + " number:");
        for (int i = 0; i < range; i++) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("total number : " + sum);
        scanner.close();
    }
}
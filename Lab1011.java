import java.util.Scanner;

public class Lab1011 {

    public static int sumArray(int[] numbers) {
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        int[] numbersArray = new int[N];

        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        int result = sumArray(numbersArray);

        System.out.println(result);

        scanner.close();
    }
}
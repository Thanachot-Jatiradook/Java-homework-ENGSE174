import java.util.Scanner;

public class Lab1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (total product types): ");
        int N = scanner.nextInt();

        int[] productIDs = new int[N];
        int[] stockQuantities = new int[N];

        System.out.println("Enter Product ID and Quantity alternatingly:");
        for (int i = 0; i < N; i++) {

            productIDs[i] = scanner.nextInt();

            stockQuantities[i] = scanner.nextInt();
        }

        System.out.print("Enter Search ID: ");
        int searchID = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < N; i++) {

            if (productIDs[i] == searchID) {

                System.out.println(stockQuantities[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product " + searchID + " not found");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Lab1010 {
    public static double calculateArea(double width, double height) {
        double area = width * height;
        return area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width Number : ");
        double inputWidth = scanner.nextDouble();
        System.out.print("Enter Height Number : ");
        double inputHeight = scanner.nextDouble();
        double result = calculateArea(inputWidth, inputHeight);
        System.out.println(result);
        scanner.close();
    }
}
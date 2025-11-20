import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score : ");

        int score = scanner.nextInt();

        switch(score/10){

            case 10:

            case 8:
                System.out.println("A");
                break;

            case 7:
                System.out.println("B");
                break;

            case 6:
                System.out.println("C");
                break;

            case 5:
                System.out.println("D");
                break;

                default:
                    System.out.println("F");
                    break;
        }
    }
}

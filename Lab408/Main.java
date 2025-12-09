package Lab408;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1, 2 Or 3 : ");
        int mode = scanner.nextInt();

        scanner.nextLine();
        Movie movie = null;

        if (mode == 1){
            System.out.println("Enter Your Title : ");
            String inputTitle = scanner.nextLine();
            movie = new Movie(inputTitle);
        }
        else if (mode == 2){
            System.out.println("Enter Your Title : ");
            String inputTitle = scanner.nextLine();

            System.out.println("Enter Your Director : ");
            String inputDirector = scanner.nextLine();
            movie = new Movie(inputTitle, inputDirector);
        }
        else if (mode == 3){
            System.out.println("Enter Your Title : ");
            String inputTitle = scanner.nextLine();

            System.out.println("Enter Your Director : ");
            String inputDirector = scanner.nextLine();

            System.out.println("Enter Your Rating : ");
            double inputRating = scanner.nextDouble();
            movie = new Movie(inputTitle, inputDirector, inputRating);
        }

        if (movie != null){
            movie.displayDetails();
        }
        scanner.close();
    }
}

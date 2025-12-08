package Lab401;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("1 Or 2") ;
        int mode = scanner.nextInt() ;

        scanner.nextLine() ;

        Book book = null ;

        if (mode == 1) {

            System.out.println("Enter Your Title Book :     ") ;
            String inputTitle = scanner.nextLine() ;

            book = new Book(inputTitle) ;
        }

        else if (mode == 2) {

            System.out.println("Enter Your Title Book :     ") ;
            String inputTitle = scanner.nextLine() ;

            System.out.println("Enter Your Author :     ") ;
            String inputAuthor = scanner.nextLine() ;

            book = new Book(inputTitle, inputAuthor) ;

        }

        if (book != null) {

            book.displayInfo() ;

        }

        scanner.close() ;
        
    }
   
}

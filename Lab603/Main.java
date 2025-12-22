package Lab603;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Book name : ") ;
        String inputName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Book price : ") ;
        double inputPrice = scanner.nextDouble() ;

        System.out.println("----------result----------");

        Book blehBook = new Book(inputName, inputPrice) ;

        double result = blehBook.calulateFinalPrice() ;

        System.out.println(result) ;

        scanner.close();

    }

}

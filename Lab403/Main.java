package Lab403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("1 Or 2 :     ") ;
        int mode = scanner.nextInt() ;

        scanner.nextLine() ;

        System.out.println("----------------------------------------------");

        Player player = null ;

        if (mode == 1) {

            player = new Player() ;

        }

        else if (mode == 2) {

            System.out.println("Enter Your Class :     ") ;
            String inputUsername = scanner.nextLine() ;

            System.out.println("Enter Your Level :     ") ;
            int inputLevel = scanner.nextInt() ;

            player = new Player(inputUsername, inputLevel) ;

        }

        System.out.println("--------------------result--------------------");

        if (player != null) {

            player.displayInfo() ;

        }

        scanner.close() ;

    }

}

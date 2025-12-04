package Lab3015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        String inputUsername = scanner.next() ;
        User umane = new User(inputUsername) ;

        if (scanner.hasNextInt()) {

            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                String command = scanner.next() ;

                if (command.equals("SET_POLICY")) {

                    int newMax = scanner.nextInt() ;
                    User.setPolicy(newMax) ;
                }

                else if (command.equals("LOGIN")) {
                    
                    String password = scanner.next() ;
                    umane.login(password) ;

                }

            }

        }

        scanner.close();

    }

}

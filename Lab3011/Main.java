package Lab3011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        if (scanner.hasNextInt()) {
            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                String command = scanner.next() ;

                SystemConfig blehConfig = SystemConfig.getInstance() ;

                if (command.equals("SET_URL")) {

                    String newUrl = scanner.next() ;
                    blehConfig.setServerUrl(newUrl) ;

                }

                else if (command.equals("SET_MAX")) {

                    int newMax = scanner.nextInt() ;
                    blehConfig.setMaxConnections(newMax) ;

                }

                else if (command.equals("SHOW")) {

                    System.out.println("URL :     " + blehConfig.getServerUrl()) ;
                    System.out.println("MAX :     " + blehConfig.getMaxConnections()) ;

                }

            }

        }

        scanner.close();

    }

}

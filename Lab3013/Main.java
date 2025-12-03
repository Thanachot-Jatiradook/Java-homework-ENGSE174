package Lab3013;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        if (scanner.hasNextInt()) {

            int N = scanner.nextInt() ;

            for (int i = 0; i < N; i++) {

                String command = scanner.next() ;

                if (command.equals("SET")) {

                    int newMax = scanner.nextInt() ;
                    LicenseManager.setMax(newMax);
                }

                else if (command.equals("CHECKOUT")) {

                    LicenseManager.checkOut() ;

                }

                else if (command.equals("CHECKIN")) {

                    LicenseManager.checkIn() ;

                }
                
                else if (command.equals("STATUS")) {

                    LicenseManager.displayStatus() ;

                }

            }

        }

        scanner.close();
    }

}

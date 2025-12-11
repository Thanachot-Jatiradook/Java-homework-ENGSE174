package Lab4015;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int inputMax = scanner.nextInt() ;

        AuditRecord.setPolicy(inputMax) ;

        scanner.nextLine() ;

        String inputName = scanner.nextLine() ;

        AuditRecord blehrecord = new AuditRecord(inputName) ;

        int n = scanner.nextInt() ;

        scanner.nextLine() ;

        for (int i = 0; i < n; i++) {

            String blehmessage = scanner.nextLine() ;

            if (blehmessage.equals("SET_POLICY")){

                int newPolicy  = scanner.nextInt();
                scanner.nextLine();
                AuditRecord.setPolicy(newPolicy);
            }
            else {
                blehrecord = blehrecord.addMessage(blehmessage) ;
            }

        }

        blehrecord.displayLog();

        scanner.close();

    }

}

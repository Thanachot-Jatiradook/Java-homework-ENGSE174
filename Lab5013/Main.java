package Lab5013;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Dev name : ") ;
        String inputDevName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Projects : ") ;
        int inputDevProjects = scanner.nextInt() ;
        
        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Admin name : ") ;
        String inputAdminName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Projects : ") ;
        int inputAdminProjects = scanner.nextInt() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Admin key : ") ;
        String inputKey = scanner.nextLine() ;

        System.out.println("----------result----------");

        User u1 = new User("Guest") ;

        Developer d1 = new Developer(inputDevName, inputDevProjects) ;

        Admin a1 = new Admin(inputAdminName, inputAdminProjects, inputKey) ;

        User[] blehUsers = new User[3] ;

        blehUsers[0] = u1 ;
        blehUsers[1] = d1 ;
        blehUsers[2] = a1 ;

        int totalclearance = 0 ;

        for (User u : blehUsers) {

            totalclearance += u.getClearanceLevel() ;

        }

        for (User u : blehUsers) {

            if (u instanceof Admin) {

                Admin adminobj = (Admin) u ;

                System.out.println(adminobj.getAdimKey()) ;

            }

        }

        System.out.println(totalclearance) ;

        scanner.close();

    }

}

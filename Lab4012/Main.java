package Lab4012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Employee Name : ") ;
        String inputName = scanner.nextLine() ;

        System.out.println("Enter Your First Hour : ") ;
        int inputHour = scanner.nextInt() ;

        System.out.println("Enter Your New Hour : ") ;
        int inputNewHour = scanner.nextInt() ;

        Schedule sh1 = new Schedule(inputHour) ;

        EmployeeSchedule emp1 = new EmployeeSchedule(inputName, sh1) ;
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1) ;

        sh1.setHour(inputNewHour) ;

        System.out.println("----------result----------");

        emp1.displaySchedule() ;
        emp2.displaySchedule() ;

        scanner.close();

    }

}

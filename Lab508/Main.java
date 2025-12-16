package Lab508;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Student name : ");
        String inputStudentName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Student id : ");
        int inputStudentId = scanner.nextInt() ;

        System.out.println("--------------------------");

        scanner.nextLine() ;

        System.out.println("Employee name : ");
        String inputEmployeeName = scanner.nextLine() ;

        System.out.println("--------------------------");

        System.out.println("Employee salary : ");
        double inputEmployeeSalary = scanner.nextDouble() ;

        System.out.println("----------result----------");

        Student blehStudent = new Student(inputStudentName, inputStudentId) ;
        Employee blehEmployee = new Employee(inputEmployeeName, inputEmployeeSalary) ;
        
        Person[] blehPerson = new Person[2] ;

        blehPerson[0] = blehStudent ;
        blehPerson[1] = blehEmployee ;

        for (Person p : blehPerson) {

            if (p instanceof Employee) {

                Employee Yee = (Employee) p ;

                Yee.applyBonus(1000.0) ;

            }

        }

        for (Person p : blehPerson) {

            System.out.println(p.getStatus()) ;

        }

        scanner.close() ;

    }

}

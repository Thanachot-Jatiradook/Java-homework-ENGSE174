package Lab602;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Student name : ") ;
        String inputName = scanner.nextLine() ;

        System.out.println("-------------------------");

        System.out.println("Student ID : ") ;
        String inputID = scanner.nextLine() ;

        Student blehStudent = new Student(inputName, inputID) ;

        blehStudent.display() ;

        String result = blehStudent.getDetail() ;
        System.out.println(result) ;

        scanner.close();

    }

}

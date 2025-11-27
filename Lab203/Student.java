package Lab203 ;

import java.util.Scanner ;

public class Student {

    String studentID ;
    String studentName ;

    static int studentCount = 0 ;

    public Student(String sid,String sname) {

        this.studentID = sid ;
        this.studentName = sname ;
        studentCount++ ;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Your Student Numbers :   ") ;
        int snumbers = scanner.nextInt() ;

        scanner.nextLine() ;

        for (int i = 0; i < snumbers; i++) {

            System.out.println("Enter Student ID :   ") ;
            String inputSid = scanner.nextLine() ;

            System.out.println("Enter Student Name :   ") ;
            String inputSname = scanner.nextLine() ;

            new Student(inputSid, inputSname);
            
        }

        System.out.println("/////total student/////");
        System.out.println("= " + Student.studentCount);

        scanner.close();

    }
    
}

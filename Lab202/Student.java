package Lab202 ;

import java.util.Scanner ;

public class Student {

    String studentID ;
    String studentName ;

    public Student(String sid, String sname) {

        this.studentID = sid ;
        this.studentName = sname ;
        
    }

    public void displayinfo() {

        System.out.println("/////Your Student Info/////") ;
        System.out.println("ID :   " + this.studentID) ;
        System.out.println("Name :   " + this.studentName) ;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Student ID :   ") ;
        String inputSid = scanner.nextLine() ;
        System.out.println("Enter your Student Name  :   ") ;
        String inputSname = scanner.nextLine() ;

        Student myStudent = new Student(inputSid, inputSname) ;
        myStudent.displayinfo() ;

        scanner.close();
        
    }
}

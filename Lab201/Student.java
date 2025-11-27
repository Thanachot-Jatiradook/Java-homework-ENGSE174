import java.util.Scanner ;

//this is a class that I create

public class Student {

    String studentID ;
    String studentName ;

    public Student(String sid, String sname) {

        this.studentID = sid ;
        this.studentName = sname ;
    }

    //this is a actual main that I write

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter your StudentID :   ") ;
        String inputSid = scanner.nextLine() ;
        System.out.println("Enter your Studentname :   ") ;
        String inputSname = scanner.nextLine() ;

        Student myStudent = new Student(inputSid, inputSname);

        System.out.println("-----Your student info-----") ;
        System.out.println("ID :   " + myStudent.studentID) ;
        System.out.println("Name :   " + myStudent.studentName) ;

        scanner.close() ;
        
    }
}

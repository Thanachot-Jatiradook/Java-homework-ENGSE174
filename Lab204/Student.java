package Lab204 ;

import java.util.Scanner ;

public class Student {
    
    String studentName ;
    int midtermscore ;
    int finalscore ;

    public Student(String Sname, int Mscore, int Fscore) {

        this.studentName = Sname ;
        this.midtermscore = Mscore ;
        this.finalscore = Fscore ;

    }

    public double calulateAverage() {
        return (this.midtermscore + this.finalscore) / 2.0 ;
    }

    public void displaySummary() {
        double avg = calulateAverage() ;

        System.out.println("Name :   " + this.studentName) ;
        System.out.println("Average Score :   " + avg) ;
        
        if (avg >= 50.0){
            System.out.println("Status : Pro") ;
        }
            else if (avg <= 50.0) {
                System.out.println("Status : Noob") ;
            }
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Yous Student Name :   ") ;
        String inputSname = scanner.nextLine() ;
        
        System.out.println("Enter Your Midterm Score :   ") ;
        int inputMscore = scanner.nextInt() ;

        System.out.println("Enter Your Finalscore :   ") ;
        int inputFscore = scanner.nextInt() ;

        Student s = new Student(inputSname, inputMscore, inputFscore) ;
        s.displaySummary() ;

        scanner.close() ;

    }
    
}

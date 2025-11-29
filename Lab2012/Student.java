package Lab2012;

public class Student {

    String studentName ;
    Course enrolledCourse ;

    public Student(String sname, Course ecourse) {

        this.studentName = sname ;
        this.enrolledCourse = ecourse ;

    }

    public void displayEnrollment() {

        System.out.println("--------------------result--------------------");
        System.out.println("Student :     " + studentName);
        System.out.println("Enrolled in :     " + enrolledCourse.getCourseInfo());

    }

}

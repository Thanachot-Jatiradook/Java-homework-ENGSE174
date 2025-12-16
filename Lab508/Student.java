package Lab508;

public class Student extends Person {

    protected int studentId ;

    public Student(String name, int studentId) {

        super(name) ;
        this.studentId = studentId ;

    }

    @Override
    public String getStatus() {

        return "Student : " + name + ", ID : " + studentId ;

    }
    
}

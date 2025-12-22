package Lab602;

public class Student implements IDisplaable {

    protected String name ;
    protected String studentId ;

    public Student(String name, String studentId) {

        this.name = name ;
        this.studentId = studentId ;

    }

    @Override
    public void display() {

        System.out.println("---Student Profile---") ;

    }

    @Override
    public String getDetail() {

        return "Name : " + this.name + ", ID : " + this.studentId ;

    }
    
}

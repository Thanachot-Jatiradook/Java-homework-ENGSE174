package Lab2012;

public class Course {

    String courseId ;
    String courseName ;

    public Course(String cid, String cname) {

        this.courseId = cid ;
        this.courseName = cname ;

    }

    public String getCourseInfo() {

        return courseId + "  :  " + courseName ;

    }

}

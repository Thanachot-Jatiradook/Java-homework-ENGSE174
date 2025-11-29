package Lab2012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your ID Course That You Want To Study :     ");
        String inputCid = scanner.nextLine();

        System.out.println("Enter Your Course Name That You Want To Study :     ");
        String inputCname = scanner.nextLine();

        System.out.println("Enter Your Student Name :     ");
        String inputSname = scanner.nextLine();

        Course blehCourse = new Course(inputCid, inputCname);

        Student blehStudent = new Student(inputSname, blehCourse);

        blehStudent.displayEnrollment();

        scanner.close();
    }
}

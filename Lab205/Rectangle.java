package Lab205;

import java.util.Scanner;

public class Rectangle {

    double width = 0 ;
    double height = 0 ;

    public Rectangle(Double w, Double h) {

        this.width = w ;
        this.height = h ;

    }

    public double getArea() {

        double Area = 0 ;
        return (Area = this.width * this.height) ;

    }

    public double getPerimeter() {
        double Perimeter = 0 ;
        return (Perimeter = 2 * (this.width + this.height)) ;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter Width Numbers :   ") ;
        Double inputW = scanner.nextDouble() ;

        System.out.println("Enter Height Numbers :   ") ;
        Double inputH = scanner.nextDouble() ;

        Rectangle bruhRectangle = new Rectangle(inputW, inputH) ;

        System.out.println("/////Result/////");
        System.out.println(bruhRectangle.getArea());
        System.out.print(bruhRectangle.getPerimeter());

        scanner.close();

    }

}

package Lab505;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Radius : ") ;
        double inputRadius = scanner.nextDouble() ;

        System.out.println("-------------------------") ;

        System.out.println("Width : ") ;
        double inputWidth = scanner.nextDouble() ;

        System.out.println("-------------------------") ;
        
        System.out.println("Height : ") ;
        double inputHeight = scanner.nextDouble() ;

        Circle blehCircle = new Circle(null, inputRadius) ;
        Rectangle blehRectangle = new Rectangle(null, inputWidth, inputHeight) ;

        Shape[] blehShapes = new Shape[2] ;

        blehShapes[0] = blehCircle ;
        blehShapes[1] = blehRectangle ;

        System.out.println("----------result----------") ;

        for (Shape s : blehShapes) {

            System.out.println("Area : " + s.calculateArea()) ;

        }

        scanner.close();

    }
    
}

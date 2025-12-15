package Lab505;

public class Circle extends Shape {

    protected double radius ;

    public Circle(String name, double radius) {
        
        this.name = name ;
        this.radius = radius ;

    }

    @Override
    public double calculateArea() {

        return 3.14159 * radius * radius ;

    }
    
}

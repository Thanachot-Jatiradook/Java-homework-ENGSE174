package Lab505;

public class Rectangle extends Shape {

    protected double width ;
    protected double height ;

    public Rectangle(String name, double width, double height) {

        this.name = name ;
        this.width = width ;
        this.height = height ;

    }

    @Override
    public double calculateArea() {

        return width * height ;
    }
    
}

package Lab504;

public class Car extends Vehicle {

    protected int wheels ;

    public Car(String color, int wheels) {

        super(color) ;
        this.wheels = wheels ;

    }

    public void displayDetails() {

        System.out.println("Color : " + color + ", Wheels : " + wheels) ;

    }
    
}

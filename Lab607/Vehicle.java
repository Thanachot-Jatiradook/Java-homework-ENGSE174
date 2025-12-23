package Lab607;

public abstract class Vehicle implements IDrivable {

    protected int currentSpeed ;

    public Vehicle(int speed) {

        this.currentSpeed = speed ;

    }

    public void displaySpeed() {

        System.out.println("Current Speed : " + this.currentSpeed + " km/h") ;

    }

    public abstract void startEngine() ;
    
}

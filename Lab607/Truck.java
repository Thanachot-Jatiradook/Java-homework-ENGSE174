package Lab607;

public class Truck extends Vehicle {

    protected int cargoWeight ;

    public Truck(int speed, int weight) {

        super(speed) ;
        this.cargoWeight = weight ;

    }

    @Override
    public void startEngine() {

        System.out.println("Truck engine started. Max cargo : " + this.cargoWeight + " tons") ;

    }
    
}

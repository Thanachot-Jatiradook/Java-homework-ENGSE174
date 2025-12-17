package Lab5015;

public class Motorcycle extends RentalVehicle {

    public Motorcycle(String model, double rentalRate) {

        super(model, rentalRate) ;

    }

    @Override
    public double calculateFee() {

        return rentalRate * 1.10 ;

    }
    
}

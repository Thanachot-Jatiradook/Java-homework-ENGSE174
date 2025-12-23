package Lab608;

public class SolarPanel extends PowerGenerator {

    public SolarPanel(String name, double power, int hours) {

        super(name, power, hours) ;

    }

    @Override
    public double getEfficientcy() {

        return 0.90 ;

    }

    @Override
    public boolean needsMaintenance() {

        return usageHours > 100 ;

    }

    public double calculateOutput() {

        double output = super.calculateOutput() ;

        if (needsMaintenance()) {

            return output * 0.5 ;

        }

        else {

            return output ;

        }

    }
    
}

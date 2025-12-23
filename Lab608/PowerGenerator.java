package Lab608;

public abstract class PowerGenerator implements IMaintainable {

    protected String name ;
    protected double basePower ;
    protected int usageHours ;

    public PowerGenerator(String name, double power, int hours) {

        this.name = name ;
        this.basePower = power ;
        this.usageHours = hours ;

    }

    public void increaseUsage(int hours) {

        this.usageHours += hours ;

    }

    public abstract double getEfficientcy() ;

    public double calculateOutput() {

        return basePower * getEfficientcy() ;

    }

}

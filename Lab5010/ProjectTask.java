package Lab5010;

public class ProjectTask {

    protected String description ;
    protected int baseHours ;

    public ProjectTask(String desc, int hours) {

        this.description = desc ;
        this.baseHours = hours ;

    }

    public double calculateCost() {

        return baseHours * 50.0 ;

    }
    
}

package Lab5013;

public class Developer extends User {

    protected int projects ;

    public Developer(String name, int projects) {

        super(name) ;
        this.projects = projects ;

    }

    @Override
    public int getClearanceLevel() {

        return 2 ;

    }
    
}

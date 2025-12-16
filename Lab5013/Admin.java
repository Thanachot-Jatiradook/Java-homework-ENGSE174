package Lab5013;

public class Admin extends Developer {

    protected String adminKey ;

    public Admin(String name, int projects, String adimKey) {

        super(name, projects) ;
        this.adminKey = adimKey ;

    }

    @Override
    public int getClearanceLevel() {

        return 3 ;

    }

    public String getAdimKey() {

        return adminKey ;

    }
    
}

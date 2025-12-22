package Lab604;

public class UserLoader implements IConfigLoader {

    protected String userId ;

    public UserLoader(String userId) {

        this.userId = userId ;

    }

    @Override
    public void loadConfig() {

        System.out.println("Loading User Profile for ID : " + this.userId) ;

    }
    
}

package Lab604;

public class DefaultLoader implements IConfigLoader {

    protected String defaultProfile ;

    public DefaultLoader(String defaultProfile) {

        this.defaultProfile = defaultProfile ;

    }

    @Override
    public void loadConfig() {

        System.out.println("Loading Default Profile : " + this.defaultProfile) ;

    }
    
}

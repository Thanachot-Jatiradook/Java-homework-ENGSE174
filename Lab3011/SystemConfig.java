package Lab3011;

public class SystemConfig {

    private static SystemConfig instance ;
    private String serverUrl ;
    private int maxConnections ;

    private SystemConfig() {

        serverUrl = "default.server.com" ;
        this.maxConnections = 10 ;

    }

    public static SystemConfig getInstance() {

        if (instance == null) {

            instance = new SystemConfig() ;

        }

        return instance ;

    }

    public String getServerUrl() {

        return serverUrl ;

    }

    public void setServerUrl(String url) {

        this.serverUrl = url ;

    }

    public int getMaxConnections() {

        return maxConnections ;

    }
    public void setMaxConnections(int count) {

        if (count > 0) {

            this.maxConnections = count ;
            System.out.println("Max Connection set") ;

        }

        else {

            System.out.println("Invalid Count") ;

        }

    }

}

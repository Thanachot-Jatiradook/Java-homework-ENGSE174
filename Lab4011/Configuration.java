package Lab4011;

public class Configuration {

    private String theme ;
    private int fontSize ;
    private boolean darkMode ;

    public Configuration(String theme, int fontSize, boolean darkMode) {

        if (fontSize < 10) {

            fontSize = 10 ;

        }

        else if (fontSize > 20) {

            fontSize = 20 ;

        }

        else {

            this.fontSize = fontSize ;

        }

        this.theme = theme ;
        this.darkMode = darkMode ;

    }

    public Configuration(Configuration base, Configuration user) {

        this.theme = user.theme ;
        this.darkMode = user.darkMode ;
        this.fontSize = user.fontSize ;

    }

    public void displaySettings() {

        System.out.println("Theme : " + this.theme + ", Size : " + this.fontSize + ", Dark : " + this.darkMode) ;

    }
    
}

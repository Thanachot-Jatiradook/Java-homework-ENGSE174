package Lab4011;

public class Configuration {

    private String theme ;
    private int fontSize ;
    private boolean darkMode ;

    public Configuration(String theme, int fontSize, boolean darkMode) {

        if (fontSize < 10) {

            this.fontSize = 10 ;

        }

        else if (fontSize > 20) {

            this.fontSize = 20 ;

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
        this.fontSize = base.fontSize ;

    }

    public void displaySettings() {

        System.out.println("Theme : " + this.theme + ", Size : " + this.fontSize + ", Dark : " + this.darkMode) ;

    }
    
}

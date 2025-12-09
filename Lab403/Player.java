package Lab403;

public class Player {

    private String  username ;
    private int level ;

    public Player() {

        username = "Guest" ;
        level = 1 ;
    }
    public Player(String username, int level) {

        this.username = username ;
        this.level = level ;

    }

    public void displayInfo() {
        
        System.out.println("User :     " + username + ", Level :     " + level) ;

    }
    
}

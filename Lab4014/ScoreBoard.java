package Lab4014;

public class ScoreBoard {

    private String gameName ;
    private int[] scores ;

    public ScoreBoard(String gameName, int[] scores) {

        this.gameName = gameName ;
        this.scores = scores ;

    }

    public ScoreBoard(ScoreBoard other) {

        this.gameName = other.gameName ;
        this.scores = new int[other.scores.length] ;

        for (int i = 0; i < other.scores.length; i++) {

            this.scores[i] = other.scores[i] ;

        }

    }
    
    public void displayScores() {

        System.out.println(gameName + ": " + scores[0] + ", " + scores[1] + ", " + scores[2]) ;

    }

}

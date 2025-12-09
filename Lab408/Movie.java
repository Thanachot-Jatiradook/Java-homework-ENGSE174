package Lab408;

public class Movie {

    private String title ;
    private String director ;
    private double rating ;

    public Movie(String title) {

        this(title, "Unknown") ;

    }

    public Movie(String title, String director) {

        this(title, director, 0.0) ;

    }

    public Movie(String title, String director, double rating) {

        this.title = title ;
        this.director = director ;  

        if (rating > 10.0) {
            this.rating = 10.0 ;

        }

        else if (rating < 0.0) {
            
            this.rating = 0.0 ;

        }
        
        else {

            this.rating = rating ;

        }

    }

    public void displayDetails() {

        System.out.println("Title : " + this.title + ", Director : " + this.director + ", Rating : " + this.rating) ;

    }

}

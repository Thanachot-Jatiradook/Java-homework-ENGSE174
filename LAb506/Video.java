package LAb506;

public class Video extends Media {

    protected int duration ;

    public Video(String title, int duration) {

        super(title) ;
        this.duration = duration ;

    }

    @Override
     public void process() { 

        System.out.println("Processing video : " + title + " for " + duration + " minutes") ;

     }

}

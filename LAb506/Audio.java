package LAb506;

public class Audio extends Media { 

    protected String quality ;

    public Audio(String title, String quality) {

        super(title) ;
        this.quality = quality ;

    }

    @Override
    public void process() {

        System.out.println("Processing audio : " + title + " with " + quality + " quality") ;

    }

}

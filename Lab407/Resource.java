package Lab407;

public class Resource {

    private String id ;

    public Resource(String id) {

        this.id = id ;
        System.out.println("Resource " + id + " created") ;

    }

    @Override

    protected void finalize() throws Throwable {

        System.out.println("Resource " + id + " finalized(destroyed)") ;

        super.finalize() ;

    }

}

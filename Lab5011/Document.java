package Lab5011;

public class Document {

    protected String title ;

    public Document(String title) {

        this.title = title ;

    }

    public void displayDetails() {

        System.out.println("Document : " + this.title) ;

    }

}

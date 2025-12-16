package Lab5011;

public class PDFDocument extends Document {

    protected int pageCount ;

    public PDFDocument(String title, int pageCount) {

        super(title) ;
        this.pageCount = pageCount ;

    }

    @Override
    public void displayDetails() {

        System.out.println("PDF : " + title + ", Pages : " + pageCount) ;

    }

}

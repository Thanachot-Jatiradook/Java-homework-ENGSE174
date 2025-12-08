package Lab401;

public class Book {

    public String title ;
    public String author ;

    public Book(String title) {

        this.title = title ;
        author = "unknown" ;

    }

    public Book(String title, String autor) {

        this.title = title ;
        this.author = autor ;

    }

    public void displayInfo() {

        System.out.println("Title :     " + title + " , Author :     " + author) ;
        

    }

}

package Lab406;

public class Point {

    private final int x ;
    private final int y ;

    public Point(int x, int y) {

        this.x = x ;
        this.y = y ;

    }

    public int getX() {

        return this.x ;

    }

    public int getY() {

        return this.y ;

    }

    public Point move(int dx, int dy) {

        int newX = this.x + dx ; 
        int newY = this.y + dy ;

        return new Point(newX, newY) ;

    }

    public void displayInfo() {

        System.out.println("X : " + this.x + ", Y : " + this.y) ;

    }

}

package Lab405;

public class Color {

    private int red ;
    private int green ;
    private int blue ;

    public Color(int r, int g, int b) {

        if (r < 0) {

            r = 0 ;

        }

        else if (r > 255) {

            r = 255 ;
        }

            this.red = r ;

        if (g < 0) {

            g = 0 ;

        }

        else if (g > 255) {

            g = 255 ;

        }

            this.green = g ;

        if (b < 0) {

            b = 0 ;

        }

        else if (b > 255) {

            b = 255 ;

        }
         
            this.blue = b ;
        
    }

    public int getRed() {

        return this.red ;

    }

    public int getGreen() {

        return this.green ;

    }

    public int getBlue() {

        return this.blue ;

    }

    public void diaplayRGB() {

        System.out.println("R =     " + this.red + ", G =     " + this.green + ", B =     " + this.blue) ;

    }

}

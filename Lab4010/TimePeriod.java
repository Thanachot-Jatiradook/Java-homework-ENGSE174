package Lab4010;

public class TimePeriod {

    private int startHour ;
    private int endHour ;

    public TimePeriod() {

        this(9, 17) ;

    }

    public TimePeriod(int startHour, int endHour) {

        if (startHour < 0) {
            startHour = 0 ;

        }

        else if (startHour > 23) {

            startHour = 23 ;

        }

        if (endHour < 0) {

            endHour = 0 ;

        }

        else if(endHour > 23) {

            endHour =23 ;

        }

        if (startHour > endHour) {

            int swap = startHour ;
            endHour = swap ;

        }

        this.startHour = startHour ;
        this.endHour = endHour ;

    }
    
    public void displayPeriod() {

        System.out.println(this.startHour + ":00 - " + this.endHour + ":00") ;

    }
    
}

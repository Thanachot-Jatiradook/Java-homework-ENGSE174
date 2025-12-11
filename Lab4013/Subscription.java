package Lab4013;

public class Subscription {

    private final String planName ;
    private final int durationDays ;

    private static int maxDuration = 365 ;

    public Subscription(String planName, int durationDays) {

        this.planName = planName ;

        if (durationDays > maxDuration) {

            this.durationDays = maxDuration ;

        }

        else if (durationDays < 0) {

            this.durationDays = 0 ;

        }

        else {

            this.durationDays = durationDays ;

        }

    }

    public Subscription(Subscription other) {

        this.planName = other.planName ;
        this.durationDays = other.durationDays ;

    }

    public static void setMaxDuration(int max) {

        if (max > 0) {
            maxDuration = max ;
        }

        else {

            System.out.println("Invalid max policy") ;

        }

    }

    public Subscription extend(int days) {

        if (days <= 0) {

            System.out.println("Invalid extension days") ;

            return this ;

        }

        int newDays ;
        newDays = this.durationDays + days ;

        if (newDays > maxDuration) {

            System.out.println("Extension failed: Exceeds max policy") ;
            return this ;

        }

        return new Subscription(this.planName, newDays) ;

    }

    public void displayInfo() {

        System.out.println("Plan : " + planName + ", Days : " + durationDays) ;

    }
    
}

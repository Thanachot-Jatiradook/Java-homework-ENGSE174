package Lab4015;

import java.util.Arrays;

public class AuditRecord {

    private final String user ;
    private final String[] logMessages ;
    private static int maxMessages = 3 ;

    public AuditRecord(String user) {

        this(user, new String[0]) ;

    }

    public AuditRecord(String user, String[] log) {

        this.user = user ;
        int size = log.length ;

        if (size > maxMessages) {
            
            size = maxMessages ;

        }

        this.logMessages = new String[size] ;

        int start = log.length - size ;

        for (int i = 0; i < size; i++) {

            this.logMessages[i] = log[start + i] ;

        }

    }

    public static void setPolicy(int max) {

        if (max > 0) {

            maxMessages = max ;
            System.out.println("Policy set to " + max) ;

        }

        else {
            
            System.out.println("Invalid policy") ;

        }

    }

    public AuditRecord addMessage(String message) {

        if (this.logMessages.length > maxMessages) {

            System.out.println("Log is full") ;

            return this ;

        }

        String[] ewlog = new String[this.logMessages.length + 1] ;

        for (int i = 0; i < logMessages.length; i++) {

            ewlog[i] = this.logMessages[i] ;

        }

        ewlog[ewlog.length - 1] = message ;

        System.out.println(message + " added");

        return new AuditRecord(this.user, ewlog) ;

    }

    public void displayLog() {

        System.out.println("User: " + this.user + ", Logs: " + logMessages.length + " " + Arrays.toString(logMessages)) ;

    }

}

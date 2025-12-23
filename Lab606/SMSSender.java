package Lab606;

public class SMSSender implements IMessageService{
    
    @Override
    public void send(String recipient, String message) {

        System.out.println("Sending SMS to " + recipient + " : " + message) ;

    }
    
}

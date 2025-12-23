package Lab606;

public class EmailSender implements IMessageService {

    @Override
    public void send(String recipient, String message) {

        System.out.println("Sending Email to " + recipient + " : " + message) ;

    }

}

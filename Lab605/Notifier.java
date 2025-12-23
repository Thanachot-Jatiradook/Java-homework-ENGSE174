package Lab605;

public class Notifier {

    private IMessageService service ; 

    public Notifier(IMessageService service) {

        this.service = service ;

    }

    public void sendNotification(String recipient, String message) {

        service.send(recipient, message) ;

    }
    
}

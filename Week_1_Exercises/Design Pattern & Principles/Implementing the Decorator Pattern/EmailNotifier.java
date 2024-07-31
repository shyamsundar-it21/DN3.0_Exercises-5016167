package decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Message \""+message+"\" sent through email");
    }
}

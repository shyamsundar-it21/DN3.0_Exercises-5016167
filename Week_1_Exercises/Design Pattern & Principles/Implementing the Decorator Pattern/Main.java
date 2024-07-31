package decorator;

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SmsNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        String message = "Hello world 11!";
        slackNotifier.send(message);
    }
}

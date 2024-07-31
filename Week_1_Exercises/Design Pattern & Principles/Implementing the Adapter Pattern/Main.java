package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new SbiAdapter(new SbiGateway());
        paymentProcessor.processPayment(11);

        paymentProcessor = new RazorAdapter(new RazorGateway());
        paymentProcessor.processPayment(11);
    }
}

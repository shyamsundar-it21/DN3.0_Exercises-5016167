package adapter;

public class RazorAdapter implements PaymentProcessor {

    private final RazorGateway razor;

    public RazorAdapter(RazorGateway razor) {
        this.razor = razor;
    }

    @Override
    public void processPayment(double amount) {
        razor.doPayment(amount);
    }
}

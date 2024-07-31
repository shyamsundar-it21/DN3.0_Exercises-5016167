package adapter;

public class SbiAdapter implements PaymentProcessor {

    private final SbiGateway sbi;

    public SbiAdapter(SbiGateway sbi) {
        this.sbi = sbi;
    }

    @Override
    public void processPayment(double amount) {
        sbi.makePayment(amount, false);
    }
}

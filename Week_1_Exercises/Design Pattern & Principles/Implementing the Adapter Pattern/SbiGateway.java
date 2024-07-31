package adapter;

public class SbiGateway {
    public void makePayment(double amount, boolean useAdvancedSecurityOptions) {
        System.out.println("Making SBI Payment: Rs." + amount + ", Using advanced security options: " + useAdvancedSecurityOptions);
    }
}

package financialforecasting;

public class Test {

    public static void main(String[] args) {
        // Test cases
        testCalculateFutureValue(1000.00, 0.05, 10); // Initial value: $1000, Growth rate: 5%, Years: 10
        testCalculateFutureValue(500.00, 0.03, 5);  // Initial value: $500, Growth rate: 3%, Years: 5
        testCalculateFutureValue(2000.00, 0.07, 7); // Initial value: $2000, Growth rate: 7%, Years: 7
        testCalculateFutureValue(1500.00, 0.10, 15); // Initial value: $1500, Growth rate: 10%, Years: 15
    }

    private static void testCalculateFutureValue(double initialValue, double growthRate, int years) {
        double futureValue = FinancialForecast.calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Initial Value: $" + initialValue + ", Growth Rate: " + (growthRate * 100) + "%, Years: " + years);
        System.out.println("Future Value: $" + String.format("%.2f", futureValue) + "\n");
    }
}

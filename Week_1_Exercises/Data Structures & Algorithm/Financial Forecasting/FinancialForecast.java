package financialforecasting;

public class FinancialForecast {

   
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }
}

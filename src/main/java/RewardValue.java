public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION = 0.0035;
    private double cashVlaue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION;
    }


}

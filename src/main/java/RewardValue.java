public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION = 0.0035;
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_CONVERSION);
    }

    private static double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_CONVERSION;
    }
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}

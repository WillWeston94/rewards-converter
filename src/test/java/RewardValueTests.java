import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReadWriteLock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private static final double DELTA = 0.0001;
    private static final double MILES_TO_CASH_CONVERSION = 0.0035;
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        int expectedMiles = (int) (cashValue / MILES_TO_CASH_CONVERSION);
        assertEquals(expectedMiles, rewardValue.getMilesValue(), DELTA);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * MILES_TO_CASH_CONVERSION;
        assertEquals(expectedCash, rewardValue.getCashValue(), DELTA);
    }
}

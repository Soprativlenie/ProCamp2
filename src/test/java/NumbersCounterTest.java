import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumbersCounterTest {

    @Test
    public void testCountNumbers() {
        {
            double expectedResult = 24.1;

            double result = NumbersCounter.countNumbers("src\\resources\\numbers.txt");
            assertEquals(expectedResult, result, 0);
        }

    }
}

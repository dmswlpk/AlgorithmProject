import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayAlgorithm3Test {
    /**
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */
    @Order(1)
    @Test
    public void testSumArrayAlgorithmHappyPathPositiveNumbers() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArrayAlgorithm3 sumArray = new SumArrayAlgorithm3();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayAlgorithmHappyPathNegativeNumbers() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArrayAlgorithm3 sumArray = new SumArrayAlgorithm3();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayAlgorithmHappyPathEmptyArray() {
        int[] array = {};
        int expectedResult = 0;

        SumArrayAlgorithm3 sumArray = new SumArrayAlgorithm3();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSumArrayAlgorithmHappyPathIntegerMaxValue() {
        int[] array = {Integer.MAX_VALUE + 1};
        int expectedResult = Integer.MAX_VALUE +1;

        SumArrayAlgorithm3 sumArray = new SumArrayAlgorithm3();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

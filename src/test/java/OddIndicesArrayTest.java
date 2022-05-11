import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesArrayTest {
    @Order(1)
    @Test
    public void OddIndexesArrayTestHappyPath() {
        /**
         * Input = {-45, 590, 234, 985, 12, 68}
         * Expected Result =  {590, 985, 68}
         */

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndecesArray oddIndexesArray = new OddIndecesArray();
        int[] actualResult = oddIndexesArray.oddIndexes(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void OddIndexesArrayTestZero() {
        int[] array = {0, 0};
        int[] expectedResult = {0};

        OddIndecesArray oddIndexesArray = new OddIndecesArray();
        int[] actualResult = oddIndexesArray.oddIndexes(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void OddIndexesArrayTestEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        OddIndecesArray oddIndexesArray = new OddIndecesArray();
        int[] actualResult = oddIndexesArray.oddIndexes(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void OddIndexesArrayTestNegative() {
        int[] array = {};
        int[] expectedResult = {};

        OddIndecesArray oddIndexesArray = new OddIndecesArray();
        int[] actualResult = oddIndexesArray.oddIndexes(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}

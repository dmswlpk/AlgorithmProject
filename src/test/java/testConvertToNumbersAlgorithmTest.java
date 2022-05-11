import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



public class testConvertToNumbersAlgorithmTest {

    @Order(1)
    @Test
    public void testConvertToNumberAlgorithmHappyPath(){

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        MyStringToNumbersAlgorithm myStringToNumbersAlgorithm = new MyStringToNumbersAlgorithm();
        int[] actualResult = myStringToNumbersAlgorithm.convertToIntArray(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testConvertToNumberAlgorithmHappyPathNegative(){

        String str = "-1, -2, -3, -4, -5";
        int[] expectedResult = {-1, -2, -3, -4, -5};

        MyStringToNumbersAlgorithm myStringToNumbersAlgorithm = new MyStringToNumbersAlgorithm();
        int[] actualResult = myStringToNumbersAlgorithm.convertToIntArray(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testConvertToNumberAlgorithmHappyPathZero(){

        String str = "0, 0, 0, 0, 0";
        int[] expectedResult = {0, 0, 0, 0, 0};

        MyStringToNumbersAlgorithm myStringToNumbersAlgorithm = new MyStringToNumbersAlgorithm();
        int[] actualResult = myStringToNumbersAlgorithm.convertToIntArray(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testConvertToNumberAlgorithmHappyPathEmpty(){

        String str = "";
        int[] expectedResult = {};

        MyStringToNumbersAlgorithm myStringToNumbersAlgorithm = new MyStringToNumbersAlgorithm();
        int[] actualResult = myStringToNumbersAlgorithm.convertToIntArray(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testConvertToNumberAlgorithmHappyPathNonValidData(){

        String str = "1,3,!&";
        int[] expectedResult = {1,3};

        MyStringToNumbersAlgorithm myStringToNumbersAlgorithm = new MyStringToNumbersAlgorithm();
        int[] actualResult = myStringToNumbersAlgorithm.convertToIntArray(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }








}

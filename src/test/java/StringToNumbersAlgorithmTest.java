import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToNumbersAlgorithmTest {


    @Order(1)
    @Test
    public void testStringToNumbersHappyPath(){
        String str = "3 33 ";
        String expectedResult = "333";

        StringToNumbersAlgorithm stringToNumbersAlgorithm = new StringToNumbersAlgorithm();
        String actualResult = stringToNumbersAlgorithm.getStringToNumbersAlgorithm(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbersHappyPathNegativeNumbers(){
        String str = "-1,-, 3,0, 33 ";
        String expectedResult = "13033";

        StringToNumbersAlgorithm stringToNumbersAlgorithm = new StringToNumbersAlgorithm();
        String actualResult = stringToNumbersAlgorithm.getStringToNumbersAlgorithm(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

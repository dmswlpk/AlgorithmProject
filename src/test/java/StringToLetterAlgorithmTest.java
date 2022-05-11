import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToLetterAlgorithmTest {
    @Order(1)
    @Test
    public void testStringToLetterAlgorithmTestHappyPath(){

        String str = " abCD!@#$11 ";
        String expectedResult = "abCD";

        StringToLetterAlgorithm stringToLetter = new StringToLetterAlgorithm();
        String actualResult = stringToLetter.getStringToLetterAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToLetterAlgorithmTestHappyPathEmptyString(){

        String str = "  ";
        String expectedResult = "";

        StringToLetterAlgorithm stringToLetter = new StringToLetterAlgorithm();
        String actualResult = stringToLetter.getStringToLetterAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToLetterAlgorithmTestHappyPathEmptyString2(){

        String str = "";
        String expectedResult = null;

        StringToLetterAlgorithm stringToLetter = new StringToLetterAlgorithm();
        String actualResult = stringToLetter.getStringToLetterAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToLetterAlgorithmTestHappyPathNumbers(){

        String str = "1,-1,4, -4, b";
        String expectedResult = "";

        StringToLetterAlgorithm stringToLetter = new StringToLetterAlgorithm();
        String actualResult = stringToLetter.getStringToLetterAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

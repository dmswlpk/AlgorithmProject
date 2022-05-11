import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {

        @Order(1)
        @Test
        public void StringToLettersAndSpacesHappyPathLetterAndSpaces() {

            String str = " a b A B C ";
            String expectedResult = " a b A B C ";

            StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
            String actualResult = stringToLettersAndSpaces.getStringToLetterAndSpacesAlgorithm(str);

            Assertions.assertEquals(expectedResult, actualResult);
        }

    @Order(2)
    @Test
    public void StringToLettersAndSpacesHappyPathSymbolsAndSpaces() {

        String str = " a,  ";
        String expectedResult = " a  ";

        StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
        String actualResult = stringToLettersAndSpaces.getStringToLetterAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void StringToLettersAndSpacesHappyPathNumbers() {

        String str = " -1, -1  ";
        String expectedResult = " -1 -1  ";

        StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
        String actualResult = stringToLettersAndSpaces.getStringToLetterAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

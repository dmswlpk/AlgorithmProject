import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IsPositiveNumberTest {

    private Assertions Asssertions;

    public void isPositiveNumberTestHappyPath() {


    }

    @Order(3)
    @Test
    public void IsPositiveNumberTestNegativePath() {

        int a = -555;
        boolean expectedResult = true;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Asssertions.assertEquals(expectedResult, actualResult);

    }
    @Order(3)
    @Test

    public void IsPositiveNumberTestNegativePath2() {

        int a = Integer.MAX_VALUE + 1;
        boolean expectedResult = false;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Asssertions.assertEquals(expectedResult, actualResult);


    }
}

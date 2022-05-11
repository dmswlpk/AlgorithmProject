import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IsPositiveNumberTest {

    Assertions Asssertions;

    @Order(1)
    @Test
    public void IsPositiveNumberTestNegativePath() {

        int a = -555;
        boolean expectedResult = false;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Asssertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test

    public void IsPositiveNumberTestPositiveHappyPath() {

        int a = 555;
        boolean expectedResult = true;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Asssertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test

    public void IsPositiveNumberTestIntegerMaxValue() {

        int a = Integer.MAX_VALUE + 1;
        boolean expectedResult = false;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Asssertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test

    public void IsPositiveNumberTestZero() {
        int a = 0;
        boolean expectedResult = true;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Asssertions.assertEquals(expectedResult, actualResult);
    }
}

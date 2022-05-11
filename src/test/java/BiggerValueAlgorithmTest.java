import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueAlgorithmTest {

    @Test
    @Order(1)

    public void defineBiggerValueAlgorithmHappyPath(){

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValueAlgorithm biggerValue = new BiggerValueAlgorithm();
        int actualResult = biggerValue.BiggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    @Order(2)

    public void defineBiggerValueAlgorithmHappyPathZeroValue(){

        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValueAlgorithm biggerValue = new BiggerValueAlgorithm();
        int actualResult = biggerValue.BiggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    @Order(3)

    public void defineBiggerValueAlgorithmHappyPathNegativeValue(){

        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValueAlgorithm biggerValue = new BiggerValueAlgorithm();
        int actualResult = biggerValue.BiggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    @Order(4)

    public void defineBiggerValueAlgorithmHappyPathZero(){

        int a = 0;
        int b = -9999;
        int expectedResult = 0;

        BiggerValueAlgorithm biggerValue = new BiggerValueAlgorithm();
        int actualResult = biggerValue.BiggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

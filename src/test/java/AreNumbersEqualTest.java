import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {


    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEqualNumbers(){
      // 89, 89
      // Expected result: 0
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathNonEqualNumbers1(){
        // -89, 89
        // Expected result: 0
        int a = -89;
        int b = 0;
        int expectedResult = -1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathNonEqualNumbers2(){
        // 89, -89
        // Expected result: 0
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualNegativePathNonEqualNumbers2(){
        // 89, -89
        // Expected result: 0
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}

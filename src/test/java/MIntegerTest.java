import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MIntegerTest {
    @Order(1)
    @Test
   public void testGetIntegerMHappyPathGoonNumber(){
       int m = 15;
       String expectedResult = "Good Number";

       MIntegerAlgorithm mInteger = new MIntegerAlgorithm();
       String actualResult = mInteger.defineMInteger(m);

       Assertions.assertEquals(expectedResult,actualResult);
   }

    @Order(2)
    @Test
    public void testGetIntegerMHappyPathBadNumber(){
        int m = 3;
        String expectedResult = "Bad Number";

        MIntegerAlgorithm mInteger = new MIntegerAlgorithm();
        String actualResult = mInteger.defineMInteger(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testGetIntegerMHappyPathPoorNumber(){
        int m = 50;
        String expectedResult = "Poor Number";

        MIntegerAlgorithm mInteger = new MIntegerAlgorithm();
        String actualResult = mInteger.defineMInteger(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testGetIntegerMUnsatisfiedNumber(){
        int m = 7;
        String expectedResult = "-1";

        MIntegerAlgorithm mInteger = new MIntegerAlgorithm();
        String actualResult = mInteger.defineMInteger(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

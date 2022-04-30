import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MIntegerTest {
    @Order(1)
    @Test
   public void testGetIntegerMHappyPath1(){
       int m = 15;
       String expectedResult = "Good Number";

       MInteger mInteger = new MInteger();
       String actualResult = mInteger.getMInteger(m);

       Assertions.assertEquals(expectedResult,actualResult);
   }

    @Order(2)
    @Test
    public void testGetIntegerMHappyPath2(){
        int m = 3;
        String expectedResult = "Bad Number";

        MInteger mInteger = new MInteger();
        String actualResult = mInteger.getMInteger(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testGetIntegerMHappyPath3(){
        int m = 50;
        String expectedResult = "Poor Number";

        MInteger mInteger = new MInteger();
        String actualResult = mInteger.getMInteger(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testGetIntegerMHappyPath4(){
        int m = 22;
        String expectedResult = "-1";

        MInteger mInteger = new MInteger();
        String actualResult = mInteger.getMInteger(m);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

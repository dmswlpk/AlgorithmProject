import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringIntersectionTest {

//    @Order(1)
//    @Test
//    public void testStringIntersectionHappyPath(){
//       /** * Test Data:
//     * “Carrot”, “carwash” → “car”
//     * “Noob”, “Schmooze” → “oo”*/
//
//        String input1 = "carrot";
//        String input2 = "carwash";
//        String expectedResult = "car";
//
//        StringIntersection stringIntersection = new StringIntersection();
//        String actualResult = stringIntersection.findStringIntersection(input1,input2);
//
//        Assertions.assertEquals(expectedResult,actualResult);
//    }

    @Order(2)
    @Test
    public void testStringIntersectionHappyPath2(){
        /** * Test Data:
         * “Carrot”, “carwash” → “car”
         * “Noob”, “Schmooze” → “oo”*/

        String input1 = "Noob";
        String input2 = "Schmooze";
        String expectedResult = "oo";

        StringIntersection stringIntersection = new StringIntersection();
        String actualResult = stringIntersection.findStringIntersection(input1,input2);

        Assertions.assertEquals(expectedResult,actualResult);
    }



}

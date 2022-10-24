import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IntersectionAlgorithmTest {

 //  {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
 //  {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
 //  {1, 2, 4, 5, 89}, {8, 9, 45} → {}
@Order(1)
@Test
    public void testIntersectionAlgorithmHappyPathPositiveNumber(){
       int[]array = {1, 2, 4, 5, 89};
       int[]array2 = {8, 9, 4, 2};
       int[] expectedResult = {2, 4};

       int[] actualResult =  new IntersectionAlgorithm().findIntersectionAlgorithm(array,array2);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
@Test
  public void testMinMaxAvePositivePath(){

      int[] array = {1,2,3,4,5,6,7,8};
      int[] expectedResult = {3,7,5};

      MinMaxAve minMaxAve = new MinMaxAve();
      int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,2,6);

      Assertions.assertArrayEquals(expectedResult,actualResult);

  }



    @Test
    @Order(2)
    public void testMinMaxAveNegativePath(){

        int[] array = {1,2,3,4,5,6,7,8};
        int[] expectedResult = {3,7,5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,2,6);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    public void testMinMaxAveNegativePath2(){

        int[] array = {1,2,3,4,5,6,7,8};
        int[] expectedResult = {3,6,5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,2,6);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }






}

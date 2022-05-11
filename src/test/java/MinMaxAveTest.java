import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
@Test
  public void testMinMaxAvePositivePath(){

      int[] array = {1,2,3,4,5,6,7,8};
    int index1 = 0;
    int index2 = 0;
      int[] expectedResult = {3,7,5};


      MinMaxAve minMaxAve = new MinMaxAve();
      int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,2,6);

      Assertions.assertArrayEquals(expectedResult,actualResult);
  }

    @Test
    @Order(2)
    public void testMinMaxAveNegativePathEmpty(){

        int[] array = {};
        int[] expectedResult = {};
        int index1 = 0;
        int index2 = 0;

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    @Order(3)
    public void testMinMaxAveNegativePath2(){

        int[] array = {2};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {2,2,2};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    @Order(4)
    public void testMinMaxAveNegative(){

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 3;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    @Order(5)
    public void testMinMaxAveNegativeIndex(){

        int[] array = {2,4,7,10};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = new int []{};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAverageAlgorithm(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}

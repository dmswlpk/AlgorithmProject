import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
    @Order(1)
    @Test
public void reverseArrayHappyPath(){
    int[] array = {2, 7, 3, 10};
    int[] expectedResult = {10, 3, 7, 2};

    ReverseArray ra = new ReverseArray();
    int []actualResult = ra.reverseArray(array);

    Assertions.assertEquals(expectedResult,actualResult);
}

    @Order(2)
    @Test
    public void reverseArrayHappyPathNegativeNumbers(){
        int[] array = {-2, -7, -3, -10};
        int[] expectedResult = {-10, -3, -7, -2};

        ReverseArray ra = new ReverseArray();
        int []actualResult = ra.reverseArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}

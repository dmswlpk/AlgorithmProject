import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Order (1)
    @Test
    public void reverseArrayHappyPath(){
        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseString(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order (2)
    @Test
    public void reverseArrayHappyPathWithEmptySpace(){
        String str = " Abracadabra ";
        String expectedResult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseString(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order (3)
    @Test
    public void reverseArrayHappyPathWithNumbers(){
        String str = "1,1,2,3,4,5 ";
        String expectedResult = "5,4,3,2,1,1";

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseString(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order (4)
    @Test
    public void reverseArrayHappyPathEmptyString(){
        String str = "";
        String expectedResult = null;

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseString(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

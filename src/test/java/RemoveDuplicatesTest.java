import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest{
    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPathLetters(){
        String str = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }


        @Order(2)
        @Test
        public void testRemoveDuplicatesEmptyString(){
            String str = "";
            String expectedResult = "Error";

            RemoveDuplicates removeDuplicates = new RemoveDuplicates();
            String actualResult = removeDuplicates.removeDuplicates(str);

            Assertions.assertEquals(expectedResult,actualResult);
        }

    @Order(3)
    @Test
    public void testRemoveDuplicatesEHappyPathNumbers(){
        String str = "1122334";
        String expectedResult = "1234";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicates(str);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenNumberTest {
    @Order(1)
    @Test
    public void oddEvenTestTestHappyPath(){ /**Test Data:
     -345 →  “Odd”
     0 →  “Even”
     222222 →  “Even”
     2147483647 + 1 →  “Undefined*/

        int n = -345 ;
        String expectedResult = "Odd";

        OddEvenNumber oddEven = new OddEvenNumber();
        String actualResult = oddEven.oddEvenNumber(n);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void oddEvenTestTestHappyPath2(){ /**Test Data:
     -345 →  “Odd”
     0 →  “Even”
     222222 →  “Even”
     2147483647 + 1 →  “Undefined*/

        int n = 0 ;
        String expectedResult = "Even";
        OddEvenNumber oddEven = new OddEvenNumber();
        String actualResult = oddEven.oddEvenNumber(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void oddEvenTestTestNegativeTest1(){ /**Test Data:
     -345 →  “Odd”
     0 →  “Even”
     222222 →  “Even”
     2147483647 + 1 →  “Undefined*/

        long n = 2147483647L + 1 ;
        String expectedResult = "Undefined";
        OddEvenNumber oddEven = new OddEvenNumber();
        String actualResult = oddEven.oddEvenNumber((int) n);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void oddEvenTestTestNeg2(){ /**Test Data:
     -345 →  “Odd”
     0 →  “Even”
     222222 →  “Even”
     2147483647 + 1 →  “Undefined*/

        int n = 2147483647 + 1 ;
        String expectedResult = "Undefined";
        OddEvenNumber oddEven = new OddEvenNumber();
        String actualResult = oddEven.oddEvenNumber(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}

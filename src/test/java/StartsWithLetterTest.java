import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StartsWithLetterTest {
    @Order(1)
    @Test
    public void testStartsWithLetter() {
        String str = ", made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        String[] expectedResult = {"lame, love, lame, live, Look"};

        StartsWithLetterAlgorithm startsWithLetterAlgorithm = new StartsWithLetterAlgorithm();
        String[] actualResult = startsWithLetterAlgorithm.getStartsWithLettersAlgorithm(str, 'l');

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

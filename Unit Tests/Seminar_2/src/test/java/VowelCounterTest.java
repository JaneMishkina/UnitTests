
import static org.junit.jupiter.api.Assertions.assertEquals;

        import org.junit.jupiter.api.Test;

public class VowelCounterTest {
    @Test
    public void testCountVowels() {
        String str1 = "Hello World";
        int expected1 = 3;
        assertEquals(expected1, VowelCounter.countVowels(str1));

        String str2 = "Java Programming";
        int expected2 = 5;
        assertEquals(expected2, VowelCounter.countVowels(str2));

        String str3 = "The quick brown fox jumps over the lazy dog";
        int expected3 = 12;
        assertEquals(expected3, VowelCounter.countVowels(str3));

        String str4 = "I love Java";
        int expected4 = 5;
        assertEquals(expected4, VowelCounter.countVowels(str4));
    }
}
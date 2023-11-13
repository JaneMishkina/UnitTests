
import static org.junit.jupiter.api.Assertions.assertEquals;

        import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        String str1 = "level";
        boolean expected1 = true;
        assertEquals(expected1, PalindromeChecker.isPalindrome(str1));

        String str2 = "racecar";
        boolean expected2 = true;
        assertEquals(expected2, PalindromeChecker.isPalindrome(str2));

        String str3 = "hello";
        boolean expected3 = false;
        assertEquals(expected3, PalindromeChecker.isPalindrome(str3));

        String str4 = "Madam";
        boolean expected4 = true;
        assertEquals(expected4, PalindromeChecker.isPalindrome(str4));
    }
}
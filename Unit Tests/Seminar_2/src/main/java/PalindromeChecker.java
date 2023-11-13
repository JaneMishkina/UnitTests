
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Приведение строки к нижнему регистру
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
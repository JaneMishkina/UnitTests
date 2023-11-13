
public class VowelCounter {
    public static int countVowels(String str) {
        str = str.toLowerCase(); // Приведение строки к нижнему регистру
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'y') {
                count++;
            }
        }
        return count;
    }
}
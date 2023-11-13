import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List getPrimeFactors(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
}

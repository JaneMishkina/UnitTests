import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
    @Test
    public void testPrimeFactors() {
// Тестирование разложения на простые множители числа 10
        List<Integer> expected1 = Arrays.asList(2, 5);
        assertEquals(expected1, PrimeFactors.getPrimeFactors(10));

// Тестирование разложения на простые множители числа 45
        List<Integer> expected2 = Arrays.asList(3, 3, 5);
        assertEquals(expected2, PrimeFactors.getPrimeFactors(45));

// Тестирование разложения на простые множители числа 100
        List<Integer> expected3 = Arrays.asList(2, 2, 5, 5);
        assertEquals(expected3, PrimeFactors.getPrimeFactors(100));

// Тестирование разложения на простые множители числа 7
        List<Integer> expected4 = Collections.singletonList(7);
        assertEquals(expected4, PrimeFactors.getPrimeFactors(7));
    }
}
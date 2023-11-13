
import static org.junit.jupiter.api.Assertions.assertEquals;

        import org.junit.jupiter.api.Test;

public class PrimeNumbTest {
    @Test
    public void testIsPrime() {
// Тестирование на простоту числа 7
        boolean expected1 = true;
        assertEquals(expected1, PrimeNumb.isPrime(7));

// Тестирование на простоту числа 10
        boolean expected2 = false;
        assertEquals(expected2, PrimeNumb.isPrime(10));

// Тестирование на простоту числа 17
        boolean expected3 = true;
        assertEquals(expected3, PrimeNumb.isPrime(17));

// Тестирование на простоту числа 20
        boolean expected4 = false;
        assertEquals(expected4, PrimeNumb.isPrime(20));
    }
}
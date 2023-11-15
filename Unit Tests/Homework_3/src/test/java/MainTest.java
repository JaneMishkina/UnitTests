import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {
    @Test
    void evenOddNumberTest(){
        assertFalse(Main.MathOperations.evenOddNumber(3));
        assertTrue(Main.MathOperations.evenOddNumber(2));
    }

    @Test
    void numberInInterval(){
        assertFalse(Main.MathOperations.numberInInterval(101));
        assertTrue(Main.MathOperations.numberInInterval(50));
    }
}
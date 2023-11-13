
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        int[] array1 = {5, 2, 7, 1, 4};
        int[] expected1 = {1, 2, 4, 5, 7};
        BubbleSort.bubbleSort(array1);
        assertArrayEquals(expected1, array1);

        int[] array2 = {10, 6, 3, 8, 9};
        int[] expected2 = {3, 6, 8, 9, 10};
        BubbleSort.bubbleSort(array2);
        assertArrayEquals(expected2, array2);

        int[] array3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(array3);
        assertArrayEquals(expected3, array3);

        int[] array4 = {-7, 5, 10, 2, 1};
        int[] expected4 = {-7, 1, 2, 5, 10};
        BubbleSort.bubbleSort(array4);
        assertArrayEquals(expected4, array4);
    }
}
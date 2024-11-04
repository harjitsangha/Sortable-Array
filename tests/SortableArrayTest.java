import src.SortableArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortableArrayTest {

    @Test
    public void testSortIntegers() {
        int[] numbers = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        
        // Call the sort method
        SortableArray.sortIntegers(numbers);

        // Verify the result
        assertArrayEquals(expected, numbers, "The array should be sorted in ascending order");
    }

    @Test
    public void testSortStrings() {
        String[] words = {"banana", "apple", "orange"};
        String[] expected = {"apple", "banana", "orange"};
        
        // Call the sort method
        SortableArray.sortStrings(words);

        // Verify the result
        assertArrayEquals(expected, words, "The array should be sorted alphabetically");
    }
}

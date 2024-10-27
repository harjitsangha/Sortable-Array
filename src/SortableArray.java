
import java.util.Arrays;

/**
 * Utility class to sort arrays of integers and strings.
 */
public class SortableArray {

    /**
     * Sorts an array of integers in ascending order.
     * @param array The array of integers to be sorted.
     */
    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] integers = {5, 3, 8, 1, 2};
        sortIntegers(integers);
        System.out.println("Sorted integers: " + Arrays.toString(integers));
    }
}

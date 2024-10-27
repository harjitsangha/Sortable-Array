import java.util.Arrays;

/**
 * Utility class to sort arrays of integers and strings.
 */
public class SortableArray {

    /* Sorts an array of strings in alphabetical order.*/
    public static void sortStrings(String[] array) {
        Arrays.sort(array);
    }


    public static void main(String[] args) {

        String[] strings = {"banana", "apple", "orange"};
        sortStrings(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}
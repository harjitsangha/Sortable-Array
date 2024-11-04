import java.util.Arrays;


public class SortableArray {

   

    
    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
    }

    
    public static void sortStrings(String[] array) {
        Arrays.sort(array);
    }


    public static void main(String[] args) {
        int[] integers = {5, 3, 8, 1, 2};
        sortIntegers(integers);
        System.out.println("Sorted integers: " + Arrays.toString(integers));

        String[] strings = {"banana", "apple", "orange"};
        sortStrings(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}

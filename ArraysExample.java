import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // ---------------------------------------------
        // Example 1: Binary Search
        // ---------------------------------------------

        // Creating an integer array of numbers (must be sorted for binary search)
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Using Arrays.binarySearch() to find the index of element 4
        // It returns the index if the element is found, otherwise a negative value
        int index = Arrays.binarySearch(numbers, 4);

        // Printing the result — should show index 3 (since 4 is the 4th element)
        System.out.println("The index of element 4 in the array is " + index);


        // ---------------------------------------------
        // Example 2: Sorting Arrays
        // ---------------------------------------------

        // Creating an Integer array (wrapper class) with random unsorted numbers
        Integer[] nums = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };

        // Sorting the array in ascending order using Arrays.sort()
        // This uses Dual-Pivot Quicksort internally for object arrays
        Arrays.sort(nums);

        // Printing the sorted array
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(nums));


        // ---------------------------------------------
        // Example 3: Parallel Sort
        // ---------------------------------------------

        // Arrays.parallelSort() sorts the array using multiple threads (in parallel)
        // It divides the array into segments, sorts them in parallel, and merges them
        Arrays.parallelSort(nums);

        // Printing the array after parallel sorting
        // Output will be the same as Arrays.sort() but may perform faster for large arrays
        System.out.println("Sorted array using Arrays.parallelSort(): " + Arrays.toString(nums));


        // ---------------------------------------------
        // Example 4: Fill Array
        // ---------------------------------------------

        // Arrays.fill() sets all elements in the array to a single specified value
        Arrays.fill(nums, 12);

        // After this operation, every element in the array will be replaced with 12
        System.out.println("Array after fill(): " + Arrays.toString(nums));
    }
}

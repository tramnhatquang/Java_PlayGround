package DSA;

import java.util.Arrays;

public class SortingArrayUsingBuiltIn {
    public static void main(String[] args) {
        int[] arr1 = {-5, 3, 0, -3, 6, 5, 19, 14, 11};
        int[] arr2 = {7, 4, 3, 2, 1, -1, -10, -100};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1)); // O(n log n) time
        System.out.println(Arrays.toString(arr2)); // O(n log n) time

    }
}

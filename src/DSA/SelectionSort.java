package DSA;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr1 = {-5, 3, 0, -3, 6, 5, 19, 14, 11};
        int[] arr2 = {7, 4, 3, 2, 1, -1, -10, -100};
        var sortedArr1 = selectionSort(arr1);
        var sortedArr2 = selectionSort(arr2);


        // check the sorted arr using bubble sort
        System.out.println(Arrays.toString(sortedArr1));
        System.out.println(Arrays.toString(sortedArr2));
    }


    private static int[] selectionSort(int[] arr) {
        /*
        For each pass, we will move left to right looking for the next smallest value. Once that is found, it will be swapped into its final position (these will be shown in lighter color).
         */
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            // Find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

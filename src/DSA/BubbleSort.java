package DSA;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {-5, 3, 0, -3, 6, 5, 19, 14, 11};
        int[] arr2 = {7, 4, 3, 2, 1, -1, -10, -100};
        var sortedArr1 = bubbleSort(arr1);
        var sortedArr2 = bubbleSort(arr2);

        // check the sorted arr using bubble sort
        System.out.println(Arrays.toString(sortedArr1));
        System.out.println(Arrays.toString(sortedArr2));
    }

    private static int[] bubbleSort(int[] arr) {
        /*
        For each pass, we will move left to right swapping adjacent elements as needed. Each pass moves the next largest element into its final position (these will be shown in green).
         */
        int length = arr.length;
        boolean isSwapped;

        for (int i = 0; i < length; i++) {
            isSwapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // If no swaps were made during the inner loop, the array is already sorted
            if (!isSwapped)
                break;
        }

        return arr;
    }
    /*
    - time: O(n^2), n is length of arr
    - space: O(n)
     */

}

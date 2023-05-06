import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		// a e i o u
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};


//		System.out.println("Initial arr: " + Arrays.toString(vowels));

		int[] arr = {-10, 1, -5, -3, 6, 4, 3, 10};
		// sort the int[] arr
		Arrays.sort(arr); // it takes O(n log n) for sorting
//		System.out.println("After sorting: " + Arrays.toString(arr)); // get the new arr after sorting

		// use the Arrays fill method from (startingIndex to endingIndex - 1) inclusively
		int startingIndex = 1, endingIndex = 4;
		Arrays.fill(arr, startingIndex, endingIndex, 100);

//		System.out.println("After filling 100 from startingIndex: " +  startingIndex + " to endingIndex: " + endingIndex + ": " +  Arrays.toString(arr));

		// array copy - shallow copy
		int[] numbers = {1, 2, 3, 4, 5};
		int[] shallowCopy = numbers; // this is a shallow copy

		// update the numbers arr
		numbers[0] = 1000;
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(shallowCopy));


		// deep copy by using static method called Arrays.copyOf(originalArr, targetLength)
		// deep copy means when you modify the original arr won't affect the copied arr
		int[] deepCopy = Arrays.copyOf(numbers, 10);
		System.out.println(Arrays.toString(deepCopy)); // deepCopy = [1000, 2, 3, 4, 5, 0, 0, 0, 0, 0]

	}
}

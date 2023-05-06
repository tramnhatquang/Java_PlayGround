import java.util.Arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		// declare an array
		int[] arr = new int[5]; // size is 5
		int[] arr1 = new int[5];


		// different ways like
		int[] numbers = {1, 2, 3, 4}; // instantiating and initializing an array of 1, 2, 3, 4

		int a = 1, b = 2, c = 3, d = 4;
		int[] numbers1 = {a, b, c, d}; // instantiating and initializing an array of 1, 2, 3, 4

		// other examples
		int size = 10;
		char[] characters = new char[size];

// It takes an array, start index, end index (exclusive) and the value for filling the array
		Arrays.fill(characters, 0, size / 2, 'A');
		Arrays.fill(characters, size / 2, size, 'B');

		System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]

		// obtain the length of an existing arr
		System.out.println(characters.length); // 4
	}
}

public class ForLoop {

	public static void main(String[] args) {
		// normal loop
		for (int  number = 1; number <= 10; number++) {
			System.out.println(number);
		}

		System.out.println();
		// loop over the index and get the value
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int number : numbers) {
			System.out.println(number);
		}

		// do while loop
		int a = 0;
		do {
			a++;
		} while (a <= 10);

		System.out.println(a);

	}
}

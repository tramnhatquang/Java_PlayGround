package CommonMistakes;

public class equalsMethod {

	private static boolean equals() {
		var brand = "dan";
		String brand2 = "dan";
		return brand == brand2; // compare the reference equality
		// where .equals() method compare the content between two objects. What we compare depends on our
		// implementation of the .equals() overriding method
	}

	public static void main(String[] args) {

	}
}

package CommonMistakes;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	private static void generics() {
		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(23);
		listOfNumbers.add(2);
		listOfNumbers.add(5);
		listOfNumbers.forEach(
				n -> System.out.println(n * 2)
		);

	}

	public static void main(String[] args) {
		generics();
	}
}

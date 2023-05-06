package CommonMistakes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	private static void concurrentModificationException() {
		List<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

		// loop through each word and remove the word "a"
//		words.forEach(word -> {
//			if (word.equals("a"))
//				words.remove(word);
//		});

		// instead using an iterator
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (word.equals("a"))
				iterator.remove();
		}

		System.out.println(words);

		// much better approach
//		words.removeIf(word -> word.equals("a"));



	}

	public static void main(String[] args) {
		concurrentModificationException(); // causes ConcurrentModificationException

	}
}

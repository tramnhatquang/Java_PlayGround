package CommonMistakes;

import java.util.Optional;

public class nullsOptional {

	private static Optional<Character> nulls_optional() {
		String name = null;
		if (name == null) {
			return Optional.empty();
		}

		return Optional.of(name.charAt(0));
	}

	public static void main(String[] args) {
		nulls_optional();
	}
}

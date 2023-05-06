package CommonMistakes;

public class switchExample {

	private static void switchs() {
		int caseIndex = 0;
		switch (caseIndex) { // use enhance switch instead of normal switch
			case 0 -> System.out.println("zero");
			case 1 -> System.out.println("one");
			case 2 -> System.out.println("two");
			default -> System.out.println("other number");
		}
	}

	public static void main(String[] args) {

	}

}

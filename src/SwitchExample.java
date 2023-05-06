public class SwitchExample {
	public static void main(String[] args) {
		int dayOfWeek = 3; // We will use this variable as input for our switch statement.

		// Switch statement begins
		switch (dayOfWeek) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
			default -> System.out.println("Invalid day number. Please enter a number between 1 and 7.");
		}
		// Switch statement ends
	}
}

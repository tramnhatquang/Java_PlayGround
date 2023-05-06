import java.util.Scanner;

public class UserInputs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = scanner.nextLine();

//		System.out.println(name);
		System.out.printf("Hello %s. How are you?%n", name);
		int age = scanner.nextInt();
		System.out.printf("%d is an excellent age to start programming", age);

		scanner.close();

	}
}

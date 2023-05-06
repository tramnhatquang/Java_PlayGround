package CommonMistakes;

import java.io.FileInputStream;
import java.io.IOException;

public class readIO {

	private static void free_resources() throws IOException {
		// forgot to close the IO input -> causing memory leaks and huge memory consumption
		try (FileInputStream inputStream = new FileInputStream("file.txt")) {
			int data = inputStream.read();

			while (data != -1) {
				System.out.println((char) data);
				data = inputStream.read();
			}
		}

	}

	public static void main(String[] args) {

	}
}

public class StringExamples {

	public static void main(String[] args) {

		// examples between string literal and string objects
		String literalString = "abc";
		String literalString2 = "abc";

		String objectString = new String("xyz");
		String objectString2 = new String("xyz");


//		System.out.println(literalString2 == literalString); // true
//		System.out.println(objectString2 == objectString); // false

		// examples for string concatenation
		String name = "Danny Tram";
		String country = "the United States of America";
		System.out.println("Hello world! I am " + name + ". I am from " + country); //Hello world! I am Danny Tram. I am from the United States of America

		// examples using String format
		String formattedString = String.format("My name is %s. I am from %s", name, country);
		System.out.println("This is the formattedString: " +  formattedString);

	}


}

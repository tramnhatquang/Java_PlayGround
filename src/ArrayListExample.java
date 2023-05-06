import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.remove(2); // remove the element at index 2
        System.out.println(numbers); // [1, 2, 4, 5, 6]

        // check if the array list is empty or not
        System.out.println(numbers.isEmpty()); // false
//		numbers.removeAll();

        // mutate each element in the Arraylist
        numbers.forEach(number -> {
            System.out.println(number * 2);
        });

        System.out.println("after: " + numbers);
    }
}

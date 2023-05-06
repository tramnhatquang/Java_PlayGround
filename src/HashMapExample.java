import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();

		// put these items below
		map.put(0, 1);
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);

		// loop thr each index and value in the hash map
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
			System.out.println();
		}


		// loop through each key in the map
		for (int key: map.keySet()) {
			System.out.println(key);
		}

		System.out.println();
		// loop through each value in the map
		for (int value: map.values()) {
			System.out.println(value);
		}


	}
}

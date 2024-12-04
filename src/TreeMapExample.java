import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create an empty TreeMap
        Map<String, Double> studentMark = new TreeMap<>();

        // Add some entries
        studentMark.put("John", 8.4);
        studentMark.put("Davis", 9.8);
        studentMark.put("Alice", 7.5);

        // Iterate over the TreeMap
        for (String key : studentMark.keySet()) {
            System.out.println("Key: " + key + " Value: " + studentMark.get(key));
        }

        // Example output:
        // Key: Alice Value: 7.5
        // Key: Davis Value: 9.8
        // Key: John Value: 8.4
    }
}

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : countMap.keySet()) {
            if (countMap.get(ch) == 1) {
                System.out.println("First Unique Character: " + ch);
                return;
            }
        }

        System.out.println("No unique character found.");
    }
}


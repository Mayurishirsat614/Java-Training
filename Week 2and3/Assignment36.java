import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            uniqueChars.add(ch);
        }

        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        sc.close();
    }
}


import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder toggled = new StringBuilder();

        for (char ch : input.toCharArray()) {
            toggled.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }

        System.out.println("Toggled string: " + toggled);
        sc.close();
    }
}


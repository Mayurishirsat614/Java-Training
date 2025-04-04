import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (N): ");
        String N = sc.next();
        System.out.print("Enter the digit (D): ");
        char D = sc.next().charAt(0);
        int count = 0;

        for (char c : N.toCharArray()) {
            if (c == D) count++;
        }

        System.out.println("Total count of digit " + D + " occurring in " + N + " is: " + count);
        sc.close();
    }
}


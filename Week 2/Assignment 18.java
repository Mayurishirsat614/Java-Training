import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int sum = 0, original = num, digits = String.valueOf(num).length();
        while (num > 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Is Armstrong: " + isArmstrong(num));
        sc.close();
    }
}


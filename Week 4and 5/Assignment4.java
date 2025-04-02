
public class DisariumNumbers {
    static boolean isDisarium(int num) {
        int sum = 0, temp = num, length = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, length--);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println("Disarium numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (isDisarium(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

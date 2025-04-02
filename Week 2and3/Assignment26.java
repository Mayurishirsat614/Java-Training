
public class HighestNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 77};
        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Second Highest: " + secondHighest);
    }
}

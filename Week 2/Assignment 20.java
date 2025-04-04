public class AverageCalculator {
    public static double average(int[] numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Average: " + average(numbers));
    }
}


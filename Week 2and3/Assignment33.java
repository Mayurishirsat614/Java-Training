import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> evenNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) evenNumbers.add(num);
        }

        System.out.println("Even Numbers: " + evenNumbers);
    }
}


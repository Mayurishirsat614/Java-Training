public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        StringBuilder sb = new StringBuilder();
        char prev = '\0';

        for (char c : str.toCharArray()) {
            if (c != prev) {
                sb.append(c);
                prev = c;
            }
        }

        System.out.println("String after removing duplicates: " + sb);
    }
}


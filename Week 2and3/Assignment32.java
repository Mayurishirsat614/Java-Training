public class ReplaceDigits {
    public static void main(String[] args) {
        String str = "H3ll0W0rld";
        String replaced = str.replaceAll("[0-9]", "*");
        System.out.println("Modified String: " + replaced);
    }
}


public class StringImmutable {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        str.concat(" World");  // This won't modify str
        System.out.println("After concat: " + str);  // Proves immutability

        str = str.concat(" World"); // New object created
        System.out.println("New String: " + str);
    }
}


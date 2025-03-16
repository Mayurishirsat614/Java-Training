public class AdditionMethods {
    public static int add1(int a, int b) { return a + b; }
    public static int add2(int a, int b) { return Math.addExact(a, b); }
    public static int add3(int a, int b) { return -(-a - b); }
    public static int add4(int a, int b) { return (a | b) + (a & b); }
    public static int add5(int a, int b) { return ((a ^ b) + ((a & b) << 1)); }

    public static void main(String[] args) {
        System.out.println("Addition Results:");
        System.out.println(add1(5, 7) + ", " + add2(5, 7) + ", " + add3(5, 7) + ", " + add4(5, 7) + ", " + add5(5, 7));
    }
}


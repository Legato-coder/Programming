package programming;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using arithmetic operations
        a = a + b; // a now becomes 30 (10 + 20)
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

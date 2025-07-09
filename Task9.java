import static java.lang.Math.*;
import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) a / b; // Changed for actual float division
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Addition of " + a + " and " + b + " = " + add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " = " + subtract(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " = " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division of " + a + " and " + b + " = " + divide(a, b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {

    // Task 1: Print digits
    public static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2: Sum (for average)
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    // Task 3: Prime check
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Task 4: Factorial
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Task 5: Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6: Power
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7: Reverse output
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }

    // Task 8: Only digits in string
    public static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }

    // Task 9: Count characters
    public static int length(String s) {
        if (s.equals("")) return 0;
        return 1 + length(s.substring(1));
    }

    // Task 10: GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        // Task 1
        System.out.println("Task 1:");
        printDigits(5481);

        // Task 2
        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        double avg = (double) sum(arr, arr.length) / arr.length;
        System.out.println(avg);

        // Task 3
        System.out.println("\nTask 3:");
        System.out.println(isPrime(7, 2) ? "Prime" : "Composite");

        // Task 4
        System.out.println("\nTask 4:");
        System.out.println(factorial(5));

        // Task 5
        System.out.println("\nTask 5:");
        System.out.println(fibonacci(5));

        // Task 6
        System.out.println("\nTask 6:");
        System.out.println(power(2, 10));

        // Task 7
        System.out.println("\nTask 7:");
        // ввод: 4 → 1 4 6 2
        // reversePrint(4, sc);

        // Task 8
        System.out.println("\nTask 8:");
        System.out.println(isDigits("123456", 0) ? "Yes" : "No");

        // Task 9
        System.out.println("\nTask 9:");
        System.out.println(length("hello"));

        // Task 10
        System.out.println("\nTask 10:");
        System.out.println(gcd(32, 48));

        sc.close();
    }
}

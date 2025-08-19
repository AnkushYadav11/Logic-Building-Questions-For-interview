public class Sumof {

    // Recursive method to find sum of natural numbers up to n
    public static int sum(int n) {
        if (n == 1) {
            return 1;  // Base case: sum of first natural number is 1
        }
        return n + sum(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        int n = 10;  // Change this value to compute sum up to a different number
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}


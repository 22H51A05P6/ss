public class Pr {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int numm) {
        for (int j = 2; j <= Math.sqrt(numm); j++) {
            if (numm % j == 0) {
                return false;
            }
        }
        return true;
    }
}
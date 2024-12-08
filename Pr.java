public class Pr {
    public static void main(String[] args) {
        for (int i1 = 2; i1 <= 100; i1++) {
            if (isPrime(i1)) {
                System.out.print(i1 + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        for (int j1 = 2; j1 <= Math.sqrt(num); j1++) {
            if (num % j1 == 0) {
                return false;
            }
        }
        return true;
    }
}
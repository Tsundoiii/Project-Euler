public class P3 {
    public static void main(String[] args) {
        long largestFactor = 0;
        for (long i = 2; i < Math.sqrt(600851475143L); i++) {
            if (600851475143L % i == 0 && i > largestFactor && isPrime(i)) {
                System.out.println(i);
                largestFactor = i;
            }
        }
        System.out.println(largestFactor);
    }
    static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

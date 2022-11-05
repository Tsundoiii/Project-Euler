public class P3 {
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        long largestFactor = 0;
        for (long i = 2; i < 600851475143L; i++) {
            if (600851475143L % i == 0 && i > largestFactor) {
                largestFactor = i;
            }
        }
        System.out.println(largestFactor);
    }
}

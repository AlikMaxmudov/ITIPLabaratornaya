public class Project {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i + "");
        }
    }
    private static boolean isPrime(int n) {
        if (n < 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}



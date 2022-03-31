import java.util.Scanner;

public class primenumber {
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int n = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
}

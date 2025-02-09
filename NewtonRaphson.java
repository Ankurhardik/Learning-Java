import java.util.Scanner;

public class NewtonRaphson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ig = sc.nextInt();
        System.out.println(Nsqrt(num, ig));
    }

    static double Nsqrt(int n, int i) {
        double k = i;
        double root;
        while (true) {
            root = 0.5 * (k + (n / k));
            if (Math.abs(root - k) < 0.0001) {  // Convergence condition
                break;
            }
            k = root;
        }
        return root;
    }
}

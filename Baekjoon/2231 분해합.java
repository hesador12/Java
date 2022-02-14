import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = 0;

        for (int i = 0; i < N; i++) {
            int B = i;
            int sum = 0;

            while (B>0) {

                sum += B % 10;
                B /= 10;
            }
            if (sum == N - i) {
                A = i;
                break;
            }
        }
        System.out.println(A);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = 1;

        for(int i = n; i>n-k; i--){
            a*=i;
        }
        for(int i = k; i>=1; i--) {
            a/=i;
        }
            System.out.println(a);
    }
}

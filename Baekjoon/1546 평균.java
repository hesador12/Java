import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr =new double[n];
        double sum = 0;
        double m;

        for(int i = 0; i<n; i++) {
            arr[i] =sc.nextInt();
        }

        Arrays.sort(arr);

        m = arr[n-1]; //이제이게 제일큰값

        for(int i= 0; i<n; i++) {
            sum+= (arr[i]/m)*100;
        }
        System.out.println(sum/n);
    }
}

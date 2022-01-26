import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i = 0; i<a; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int dp[][] = new int [k+1][n+1];

            
            for(int j = 1; j<=n; j++) {
            	dp[0][j] = j;
            }            
            for(int j = 1; j<=k; j++) {
                for(int z=1; z<=n;z++) {
                    dp[j][z] = dp[j][z-1]+dp[j-1][z];
                }
             }
                    arr[i]= dp[k][n];
            }
            for(int i = 0; i<a; i++) {
                System.out.println(arr[i]);
    }
  }
}

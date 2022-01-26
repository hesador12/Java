import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] a = new int[15][15];
                for(int i = 0; i<=14; i++) {
                    a[i][1]=1;
                    a[0][i]=i;
                }
                for(int i = 1; i<=14; i++) {
                    for(int j=2;j<15; j++) {
                        a[i][j]= a[i][j-1]+a[i-1][j];
                    }
                }
                    int b = sc.nextInt();
                    for(int i = 0; i<b; i++) {
                        int k = sc.nextInt();
                        int n = sc.nextInt();
                        System.out.println(a[k][n]);
         }
      }
    }

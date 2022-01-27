import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int sum = 0;
        
        for(int i = 0; i<n; i++) {
        A[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n; i++) {
        B[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        Arrays.sort(B); //오름차순이니까 뒤집어야겠다
        
        for(int i =0; i<n; i++) {
        	sum += A[i]*B[n-i-1];
     }
    System.out.println(sum);
  }
}
//문제에서 B의배열을 재배열 하지 말라는 얘기는 arrays.sort(B)를 쓰지 말라는 얘기가 아니었을까,,? 오름차순 배열도 재배열, ,,,아님 새로운 배열 C를 만들지 말라는 ,,???????

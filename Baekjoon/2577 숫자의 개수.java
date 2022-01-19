import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[10];
		int D = A * B * C;
			while (D>0) {
				arr[D % 10]+=1;
				D /=10;
			}
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] B = new int[42];
		int C = 0;	
		
		for(int i = 0; i<10; i++) {
			int A = sc.nextInt();
			B[A%42] = 1;
		}
		for(int j= 0; j<42; j++) {
			if (B[j]==1)  
				C++;
			}	
		System.out.println(C);
	}
}

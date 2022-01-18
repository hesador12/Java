import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Max = -1000000;
		int Min = 1000000;
		
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			
			if (A>Max) {
				Max = A;
			}
			if (A<Min) {
				Min = A;
				}
		}
		sc.close();
		System.out.println(Min+" "+Max);
	  }
  }

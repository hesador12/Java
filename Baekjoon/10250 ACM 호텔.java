import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int X = 0;
		int Y = 0;
		
		for(int i = 0; i<T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
		
		if(N % H == 0) {
			 Y = H * 100;
			 X = N / H;
			 System.out.println(X+Y);
		}
	  else {
			Y = N % H * 100;
			X = N/H +1;
			System.out.println(X+Y);
	
			}
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int A = w-x;
		int B = h-y;
		
		int result_1 = (Math.min(x, A));
		int result_2 = (Math.min(y, B));
		
		System.out.println(Math.min(result_1, result_2));
			
		}
	}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = str.length();
				for(int i = 0; i<n; i++) {
			System.out.print(str.charAt(i));
				if((i+1)%10==0) {
					System.out.println();
			}
		}
	}
}

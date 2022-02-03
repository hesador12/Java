import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String x;
	
		for(int i = 0; i<n; i++) {
			x = sc.next();
			int s = 0;
			int z = 0;
			
		for(int j=0; j<x.length();j++) {
			if(x.charAt(j)=='O') {
				s++;
				z+=s;
		}	
			else s=0;
		}
		System.out.println(z);
		}
	}
}

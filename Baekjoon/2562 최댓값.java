import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		int B = 0;
		int C = 0;
		
		for(int i = 0; i<9;i++) {
			arr[i] = sc.nextInt();
		}
			for(int i =0; i<9; i++) {
			if (arr[i]>B) {
			B = arr[i];
			C = i;
		    }
    }
		System.out.println(B);
		System.out.println(C+1);
	} 
}

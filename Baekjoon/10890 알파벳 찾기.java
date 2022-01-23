import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int arr[] = new int[26];
		
		for(int i = 0; i<26 ; i++) {
			arr[i] = -1;
		}	
		for(int i = 0; i<a.length();i++) {
		char b = a.charAt(i);
		if(arr[b -97]== -1 ) {
			arr[b -97] = i ;
        }
      }
       for(int i = 0; i<26 ; i++) {
	System.out.print(arr[i] +" ");	
		}
	}	
}

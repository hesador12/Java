package three;
import java.util.Scanner;
public class Howto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		String arrr[]= new String[a];
		
		for (int i = 0; i<a; i++) {
			arr[i]= sc.nextInt();
			arrr[i] = sc.next();
	}
        
	for(int i = 0; i<a; i++) {
		for(int j= 0 ; j<arrr[i].length(); j++) {
			char b =arrr[i].charAt(j);
			for(int k = 0;k<arr[i]; k++) {
		System.out.print(b);
			}//이걸안에 써주는거랑
		}
        System.out.println();
    //이게 문제였던거임ㅇㅇ,,ㅎ,
	}
	}
}

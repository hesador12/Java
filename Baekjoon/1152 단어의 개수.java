import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		StringTokenizer st = new StringTokenizer(A," ");
		//new StringTokenizer(A)라고만 해도 띄어쓰기가 구분자로 적용됨.. 
		System.out.println(st.countTokens());
	}
}

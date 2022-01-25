import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Math.max(a, b);
		int d = Math.min(a, b);
		
		while(true) {
			int z = c;
			c=d;
			d=z%d;
			if(d<=0) {
				break; //몫이 양수값일 동안 min 나누기 나머지값 을 반복 _ 몫이 0(나눌수없을때) 이면 최종 나머지가 gcd가 되는,,
			}
		}
		System.out.println(c);
		System.out.println(a*b/c);
	}
}

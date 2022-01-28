import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            if(a==0) {
                break;
        }
             int r = 0;//a를 뒤집었을때!
             int b = a;
             while(a>0) {
            r = r*10 +(a%10);
              a/=10;
        }
            if(b==r) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}

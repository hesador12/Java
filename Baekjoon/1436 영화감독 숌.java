import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
 
        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }//666이라는 숫자열을 포함하면 count+=1 이라는
        }
        System.out.println(num);
    }
}

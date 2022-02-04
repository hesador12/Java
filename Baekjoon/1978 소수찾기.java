import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int a=0; //a = 소수의 갯수

        for(int i=0;i<n;i++) {
            int b = sc.nextInt();
            int j; //for문에 넣었더니 아래 if 문에서 다시 j를 쓰자니 애매해서 먼저 정의
            for (j = 2; j * j <= b; j++) {
                if (b % j == 0)
                    break;
            } //j^(1/2)의 값들로 주어진 수르 나눴을때 나머지가 0이 나오면 소수가 될수없음(1외의 인수 존재)
                if((j*j>b)&&(b!=1)) {
                    a+=1; //그 외 경우 소수인데 1이면 소수가 아닌것도 고려해줘야했음; 
                
            }
        }
        System.out.println(a);
    }
}

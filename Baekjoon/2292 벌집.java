import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        
        if(n==1) {
            System.out.print(1); 
        }
      
        else {
            while(b<=n) {
                b = b+(6*a); //초기화하고 다시 이어가는
                a+=1;
            }
            System.out.print(a);
        }
    }
}//b가 n보다 클땐 반복문에 들어갈일이없으니까 종료됨,, 생각해줄필요가 없었음

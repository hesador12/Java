import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int S1=0;
        int S2=0;
        int A = 0, B=0;
        for(int i=0;i<4;i++) {
            S1 = sc.nextInt();
            A += S1;
        }
        
        for(int i=0;i<4;i++) {
            S2 = sc.nextInt();
            B += S2;
        }
    if(A>=B) {
        System.out.println(A);
        }
        else if(A<B) {
            System.out.println(B);
  }
 }
}

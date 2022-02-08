import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        LinkedList<Integer> A = new LinkedList<>();

        for(int i = 1; i<=N; i++) {
            A.add(i);
        }
        while(A.size()>1){
            A.poll();
            A.add(A.poll());
        }
        System.out.println(A.poll());
    }
}

import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> A = new LinkedList<>();

            for(int i = 1; i<=N; i++) {
                A.add(i);
            }
                  System.out.print("<");
                for(int i = 0; i<N-1; i++) {
                    for (int j = 0; j < K - 1; j++) {
                        A.add(A.poll());
                 }

                    System.out.print(A.poll());
                    System.out.print(", ");
                }
                 System.out.print(A.poll()+">");
                }
          }

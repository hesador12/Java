import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int b = 0; //back에서 출력하기 위한 int
        int N = sc.nextInt();

        for(int i = 0; i<N; i++) {
            String str = sc.next();
            switch(str) {
                case "push":
                    int a = sc.nextInt();
                    b = a;
                    queue.add(a);
                    break;//반복하다보면 결국 마지막에 갱신된 b가 back에서 출력될 값이기 때문에

                case "pop":
                    if (!queue.isEmpty())
                        System.out.println(queue.poll());
                    else
                        System.out.println(-1);
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    if (!queue.isEmpty())
                        System.out.println(0);
                    else
                        System.out.println(1);
                    break;

                case "front":
                    if (!queue.isEmpty())
                        System.out.println(queue.peek());
                    else
                        System.out.println(-1);
                    break;

                case "back":
                    if (!queue.isEmpty()) {
                        System.out.println(b);//맨 마지막 값을 빼는 메소드는 따로 없더군용(??)
                    }
                    else
                        System.out.println(-1);
                    break;
            }
        }
    }
}

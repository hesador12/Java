import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++) {
            String[] str = br.readLine().split(" ");

            switch(str[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(str[1]));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(str[1]));
                    break;

                case "pop_front" :
                    if(!deque.isEmpty())
                        System.out.println(deque.pollFirst());
                    else
                        System.out.println(-1);
                    break;

                case "pop_back":
                    if(!deque.isEmpty())
                        System.out.println(deque.pollLast());
                    else
                        System.out.println(-1);
                    break;

                case "size":
                    System.out.println(deque.size());
                    break;

                case"empty":
                    if(deque.size()==0)//(deque.isEmpty())으로 해주려다 그냥 해본,,
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;

                case"front":
                    if(!deque.isEmpty())
                        System.out.println(deque.peekFirst());
                    else
                        System.out.println(-1);
                    break;

                case"back":
                    if(!deque.isEmpty())
                        System.out.println(deque.peekLast());
                    else
                        System.out.println(-1);
                    break;
                }
            }
        System.out.println(sb);
    }
}//stringBuilder을 활용하려면 System.out.println말고 sb.append().append('\n') 으로 쭉 표현해줬어도 되는 부분. 
//

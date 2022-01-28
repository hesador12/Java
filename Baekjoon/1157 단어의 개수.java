import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];
        String b = sc.nextLine().toUpperCase();
        int m = 0; //m끼리 비교해서 가장 자주나온 알파벳을 찾으려는 것,,
        int count = 0; //자주나온 알파벳의 갯수 >> 만일 1세트 이상이면 물음표를 출력해야함

        for(int i = 0; i<b.length(); i++) {
            arr[b.charAt(i)-'A']+=1; 
        }
        char word = '0';
        for(int i = 0; i<arr.length; i++) {
            if(m<arr[i]) {
                m = arr[i];
                word = (char)(i+'A');
            }
            else if(m ==arr[i]) {
                word = '?';
            }
        }
            System.out.println(word);
    }
}

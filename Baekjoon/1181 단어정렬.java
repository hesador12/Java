import java.util.Arrays;
import java.util.Comparator; 
import java.util.Scanner; 
public class Main { public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] a = new String[N];
    for (int i = 0; i < N ; i++) {
        a[i]=sc.next(); 
    } 
    Arrays.sort(a, new Comparator<String>() { 
        @Override public int compare(String o1, String o2) {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2); //정해진틀에 비교하고싶은 두가지 작성해주면 됨,,
            } 
            else { return o1.length() - o2.length(); } } }); 
    System.out.println(a[0]);
    for(int i =1 ; i < N; i++) { 
        if (!a[i].equals(a[i-1])) {//아닐경우에 라는 조건문을쓸때 != 인데 string 이니까 equals 앞에!를써주는,,
        	
            System.out.println(a[i]); 
        	}
        }
    } 
}

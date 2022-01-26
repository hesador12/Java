import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 		
		int arr[][] = new int[n][3]; 
		
		for(int i=0;i<n;i++) { 
			arr[i][0]= sc.nextInt();
			arr[i][1]= sc.nextInt();
		}
				int a; 
		for(int i=0;i<n;i++) {
			a =0;
			for(int j=0;j<n;j++) { 
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) { 
					a++; 
				}
			}
			
			arr[i][2]=a+1;
		}
		
		for(int i=0;i<n;i++) { 
			System.out.print(arr[i][2]+" ");
		}
	}	
}

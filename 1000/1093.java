import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();  // 몇개? 10입력.
	        int[] arr = new int[24];


	        for (int i = 0; i < n; i++) { // n째로 돌린다.
	            int num = scanner.nextInt(); // n개의 숫자 막 입력 가능.
	         // ex) num = 2 2 6 3 6 --> arr[2-1]=arr[2-1]+1=arr[1]=0+1=1, 
	         //     arr[2-1]=arr[2-1]+1=1+1=2  즉, num에서 2가 2번 들어갔다. 그걸.arr[1]에 입력. 즉, arr[1]=2
	            arr[num-1] += 1; 
	        }

	        for (int i = 0; i < 23; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	}
	

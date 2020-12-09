// 10818번 풀이방법1.
// 최솟값과 최댓값을 찾는 문제.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 정수 갯수 입력
		
		int[] n = new int [num];
		
    // 문제에서 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수라고 했으므로.
		int max = -1000000; 
		int min = 1000000;
		
		
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
			
			if(max < n[i]) {
				max = n[i];
			}
			if(min > n[i]) {
				min = n[i];
			}

		}
		System.out.print(min + " " + max);

	}

}

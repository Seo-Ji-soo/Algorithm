// 10818번 풀이방법2.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 정수 갯수 입력
		
		int[] n = new int [num];

		// 먼저 n 배열의 값 입력.
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
		}
		
    // 입력받은 배열 n의 0번째로 max와 min 초깃값 설정.
		int max = n[0];
		int min = n[0];
		
		
		for(int i=0;i<n.length;i++) {
			if(max < n[i]) {
				max = n[i];
			}
			if(min > n[i]) {
				min = n[i];
			}
			
		}

		System.out.print(min + " " + max);
		
		
		
	}

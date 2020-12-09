// 최댓값이 어디에 있는지 찾는 문제.
/*
*9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 
그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
	
		int[] n = new int [9]; // 9개의 자연수.
				
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt(); // 9개 자연수 입력하기.	
		}
		
		int max=n[0];
		int cnt=1; // 큰 값이 몇 번째 수에 있는지 카운트하기.
		
		for(int i=1; i<n.length; i++) {
			
			if(max < n[i]) {
				max = n[i];
				cnt=i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(cnt);
		
		
	}

}

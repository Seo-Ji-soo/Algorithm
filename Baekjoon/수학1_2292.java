// 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//입력한 숫자
		// 1      --->  방갯수:1,  카운트수:1
		// 2~7    --->  방갯수:6,  카운트수:2
		// 8~19   --->  방갯수:12, 카운트수:3
		// 20~37  --->  방갯수:18, 카운트수:4
		// 38~61  --->  방갯수:24, 카운트수:5
		

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();// 입력한 숫자
		int c=1;  // 방의 갯수 카운트
		int start = 2;   // 첫번째 수(최솟값)
		
		if(n==1) {  // 입력한 숫자가 1일때,
			System.out.println(c); // 방의 갯수는 1
		}else if(n<=1000000000) {
			while(start<=n) { // 입력한 숫자가 시작 숫자보다 크면
				start = start+(6*c); // 시작 수를 늘려줌.
				c++;  // 카운트 수 늘림
			}
			System.out.println(c);
		}
		
	    
	    	
	}
		
}


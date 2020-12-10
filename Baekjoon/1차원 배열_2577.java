// 각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제

/*
*세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 
0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 
A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 세개 정수 입력 받기.
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 세개의 정수 곱 문자열로 넣어주기.
		String result =Integer.toString(A*B*C);
		
		// 문자열을 배열에 한개씩 넣어주기.
		String[] resultnum = result.split("");
		
		// 0~9까지의 입력되는 숫자의 갯수 넣을 배열 생성.
		int [] arr = new int [10];
		
		for(int i=0;i<arr.length;i++) {
		 for(int j=0; j<resultnum.length;j++) {	
			if(i==Integer.valueOf(resultnum[j])) { // i랑 resultnum j번째 배열의 숫자랑 같니??
				arr[i]+=1;  // 같으면 arr i번째 배열을 하나씩 카운트.
				continue;
			} 
		 }
		 
		 System.out.println(arr[i]);
		 
		}

	}

}

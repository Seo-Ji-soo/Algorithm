// 팩토리얼은 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.
/*
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력 - 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

출력 - 첫째 줄에 N!을 출력한다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(function(n));
		
		
	}// 메인 메소드 종료

	public static int function(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*function(n-1);
		}

	}
	
}//클래스종료


//정수를 문자열로 입력받는 문제.  
/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   // 입력 갯수 입력받기
		
		String num = sc.next();  // 문자열 입력

		String[] a =num.split(""); // 문자열 각각 하나씩 문자열배열에 저장.
		
		int sum=0;   // 숫자들의 합 저장해줄 변수 생성.
		
		// 문자열 각각 하나씩 저장한 것들 더하기
		for(int i=0;i<n;i++) {
			sum+=Integer.parseInt(a[i]);
		}
		
		System.out.println(sum);
		}
	}

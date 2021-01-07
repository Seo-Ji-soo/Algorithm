// N을 소인수분해하는 문제.
/*
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력 - 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력 - N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. 
       N이 1인 경우 아무것도 출력하지 않는다.
       
ex) 입력 - 72    / 출력 - 2 2 2 3 3   
    입력 - 9991  / 출력 - 97 103
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int c = 2; // 나누는 수.
		
		if(n==1) {
			System.out.println("");
		}else {
			while(n>=c) {
				if(n%c==0) {
					n=n/c;
					System.out.println(c);
					
				}else {
					c++;
					
				}
			}
		}
	}
		
}


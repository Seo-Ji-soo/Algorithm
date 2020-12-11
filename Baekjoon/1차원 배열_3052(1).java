// 각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제
/*
*두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 

예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
*/

// 3052번 풀이방법1.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int [10];
		
		int cnt = 0;  // 나머지가 같은 갯수.
		
		
		int[] rest = new int [10];
		
		for(int i=0; i<n.length; i++) {
			n[i]=sc.nextInt();
			
			rest[i] = n[i]%42;
			
			continue;
		}
		
		for(int i=0; i<n.length; i++) {
			 cnt++;
			 
			for(int j=i+1; j<n.length; j++) {
				if(rest[i]==rest[j]) {
					cnt--;
					break;
				}
				
			}
		 
		}
		
		System.out.println(cnt);
	}
		
}


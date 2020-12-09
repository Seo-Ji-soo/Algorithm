// 원래 수로 돌아올 때까지 연산을 반복.
/*
*0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 
새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 
새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();  // 처음 입력 받은 수.
		int one = 0; // 첫번째 자리 숫자 초깃값지정. (1의자리)
		int two = 0; // 두번째 자리 숫자 초깃값지정. (10의자리)
		int twotemp = 0; // 두번째 자리 임시 저장 자리
		int cnt = 0; //사이클 길이
		
		one = n/10;
		two = n%10;
		
		while(true) {
			twotemp = two;
			
			two = (one+two)%10;  // 두 숫자의 합은 가장 오른쪽 자리에.
			                     // 두 숫자의 합이 두번째 자리 숫자에 옴.
			
			one = twotemp;
			
			cnt++;
			
			if(n==one*10+two) {
				break;
			}

		}
		
		System.out.println(cnt);
		
	}

}

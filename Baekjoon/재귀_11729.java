// 재귀적인 패턴을 재귀함수로 찍는 문제2
/*
세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 
각 원판은 반경이 큰 순서대로 쌓여있다. 
이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
1. 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
2. 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
*/

import java.util.Scanner;


public class Main {
	public static int result=0;  // 이동횟수. 즉, 결과로 나와야 되는 값.
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		// 원판이 이동하는 공식 --> n = (n-1)*2+1
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 원판의 개수
		hanoi(n,1,2,3); // 1,2,3은 장대를 말함. 1 = 첫번째 장대, 2 = 두번째 장대....
		sb.insert(0, result+"\n");  // 원하는 위치에 문자열 삽입. 즉, 0번째에 result값 출력하겠다....
		System.out.println(sb);
		
	}// 메인 메서드 종료

	public static void hanoi(int n, int a, int b, int c) {
		result++;
		if(n==1) { // 이동할 원반의 수가 1개라면?
			sb.append(a+ " "+c+ "\n");
		}else {
			// n-1을 a에서 b로 이동
			hanoi(n-1,a,c,b);
			// 1을 a에서 c로 이동
			sb.append(a+ " "+c+ "\n");
			// n-1을 b에서 c로 이동
			hanoi(n-1,b,a,c);
		}
	}

	
	
}//클래스종료


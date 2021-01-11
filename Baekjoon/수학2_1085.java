// 직사각형과 점의 거리를 구하는 문제.
/*
한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

입력 - 첫째 줄에 x, y, w, h가 주어진다.

출력 - 정답!
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// Math.min(value1, value2) : 함수는 주어진 숫자들중 가장 작은 값을 반환.(괄호 안에는 무조건 숫자형이어야함.)
		System.out.println(Math.min(Math.min(x,w-x),Math.min(y,h-y)));
		
	
			   }//메인메소드종료 
		
		}//클래스종료


// 직사각형을 완성하는 문제.
/*
세 점이 주어졌을 때, 
축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력 - 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력 - 직사각형의 네 번째 점의 좌표를 출력한다.

입력 - 30 20 
       10 10
       10 20
출력 - 30 10       
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    // 입력 받을 배열 선언.
			int [][] arrs = new int [3][2];
			
			// 결과값 출력할 변수 선언.
			int a = 0;
			int b = 0;
			
			// 3줄 씩 2개의 숫자 입력 받기.
			for(int i=0; i<3; i++) {
				for(int j=0; j<2; j++) {
					arrs[i][j]= sc.nextInt();
					
					if(j==0) {
						if(arrs[0][j]==arrs[1][j]) {
							a=arrs[2][j];
						}else {
							if(arrs[0][j]==arrs[2][j]) {
								a=arrs[1][j];
							}else {
								a=arrs[0][j];
							}
						}
					}else {
						if(arrs[0][j]==arrs[1][j]) {
							b=arrs[2][j];
						}else {
							if(arrs[0][j]==arrs[2][j]) {
								b=arrs[1][j];
							}else {
								b=arrs[0][j];
							}
						}
					
					}
		
				}
			}
		
			System.out.println(a+" "+b);
			
  }//메인메소드종료

	
}//클래스종료


// OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제.
/*
*"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 

예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
*/

// 8958번 풀이방법1.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // 케이스의 갯수 지정.
		
		
		String[] ox = new String[n]; // ox들어갈 문자열 생성.
		
       
		for(int i=0; i<ox.length;i++) {  
			ox[i]=sc.next();   // ex) ox[0] = OOXXOXXOOO , ox[1] = OOXXOOXXOO , ....
		}
		
		sc.close();
		
	  for(int i=0; i<ox.length;i++) {	
		  int O=0;  // 연속된 0의 갯수.
		  int sum = 0;  // 0의 갯수의 합.
		  
		for(int j=0; j<ox[i].length();j++) { // j=0부터 ox[i]번째의 크기까지.
			if(ox[i].charAt(j)=='O') { // ox[i]문자열에서 j번째 문자 가져오기.
				O=O+1;  // O이 연속으로 나올경우만 1씩 늘어남.
				sum = sum+O;
			}else {
				O=0; // 문자가 X가 나오면 O 숫자 센 거 리셋.
			}
		}
		System.out.println(sum);
	  }	

    }
}


// 8958번 풀이방법2. (for each문과 getBytes() 이용하기.)

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();  // 케이스의 갯수 지정.

       
		for(int i=0; i<n;i++) {
			
		  int O=0;  // 연속된 0의 갯수.
		  int sum = 0;  // 0의 갯수의 합.
		 
		// getBytes()는 입력받은 문자열을 byte형 배열로 반환
		for(byte value : sc.next().getBytes()) { 
			if(value=='O') { 
				O=O+1;  // O이 연속으로 나올경우만 1씩 늘어남.
				sum = sum+O;
			}else {
				O=0; // 문자가 X가 나오면 O 숫자 센 거 리셋.
			}
		}
		
		sb.append(sum).append('\n');
	  }
		System.out.println(sb);

    }
}


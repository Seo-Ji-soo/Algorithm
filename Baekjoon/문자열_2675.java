//각 문자를 반복하여 출력하는 문제
/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
S에는 QR Code "alphanumeric" 문자만 들어있다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // 몇번째 줄까지 입력할 건지 숫자.
		
		 for(int i=0; i<n; i++) {
			 int num = sc.nextInt(); // 각각의 문자를 몇번씩 출력할 건지.
			 String s = sc.next();  // 문자열 입력. // nextLine()은 공백까지 읽지만, next()은 공백을 읽지 않음.
			 for(int j=0; j<s.length(); j++) {  // 문자열의 길이(각각의 인덱스)를
				 for(int k=0; k<num; k++) { // num의 숫자만큼 출력
					 System.out.print(s.charAt(j));
				 }
			 }
			 
			 System.out.println();
		 }
	}
}

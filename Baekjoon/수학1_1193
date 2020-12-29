// 분수의순서에서 규칙을 찾는 문제
/*
 1/1     1/2     1/3     1/4     1/5
 2/1     2/2     2/3     2/3     2/4
 3/1     3/2     3/3     ...     ...
 4/1     4/2     ...     ...     ...
 5/1     ...     ...     ...     ...
 
이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 
지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // 내가 입력한 수. 즉,몇번째 분수를 출력할거니?
		
		int line=0;  // 라인수 (라인 수에 따라 분자와 분모가 결정되고 카운트 수가 하나씩 늘어남.
		int count=0;  // 분수의 갯수.
		
		while(count<n) {
			line++;
			count = line*(line+1)/2;    // 라인이 2이면 분수의 갯수가 1라인의 1개 2라인의 2개 이므로 총 3개
		}
		
		
		// 라인이 홀수인 숫자일때 (ex.1,3,5..) 랑 라인이 짝수인 숫자일때라 분모 분자가 다름.
		// 라인이 홀수이면 분모가 1 2 3 4... 이렇게가고
		// 라인이 짝수이면 분모가 4 3 2 1... 이렇게 감
		
		if(line%2!=0) {  // 라인이 홀수 일때,
			int top = (count-n)+1;  // 분자
			int bottom = line-(count-n); // 분모
			System.out.println(top+"/"+bottom);
		}else {  // 라인이 짝수 일때,
			int top = line-(count-n);  // 분자
			int bottom = (count-n)+1; // 분모
			System.out.println(top+"/"+bottom);
		}
	    	
	}
		
}


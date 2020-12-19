//주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제.
/*
알파벳 대소문자로 된 단어가 주어지면, 
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
단, 대문자와 소문자를 구분하지 않는다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toUpperCase(); // 스펠링입력후 대문자로 바꿈.(toUpperCase(): 모든 문자열을 대문자로)
		
		int[] a = new int [26]; // a~z 의 갯수 넣을 배열. 스펠링 갯수가 총 26개이므로 배열크기가 26.		
		int max=0;  // 가장 많이 나온 알파벳의 갯수
		int ms=0; //  
		
		// 이렇게 하면 같은 스펠링이면 하나씩 연이어서 증가함.
		// ex) 입력: axx  출력: 112(a[0] = 1, a[1]=1, a[2]=2)
		// x가 처음에는 1로 증가하지만 또 x가 나오면 다음에는 2로 증가함.
		for(int i=0; i<s.length();i++) {   
		   a[s.charAt(i)-65]++;  // ex) s.charAt(i) = 'a' 라면, a를 숫자로 바꾸면 65. 즉, a라면 배열변수a의 0번째를 숫자 하나 증가시켜라.  
		}
		
		
		// 위에서 입력한 스펠링은 나온 만큼 숫자가 증가하여 각 배열에 담겨져 있음. 
		// 증가 안 되어있는 배열의 i번째 들은(즉, 입력한 문자열에 없는 스펠링들은) 0으로 초깃값 되어있음.
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];  // 배열중에서 가장 큰 숫자가 담김(가장 많이 나온 알파벳의 갯수)
				ms = i+65;  // 가장 큰 숫자가 담긴 인덱스를 ms에 저장. ex) 2번째 인덱스에 가장 큰 숫자가 담긴다면, ms=2 인데 이것을 char로 바꿔야 됨으로 +65해줌.
			}else if(max==a[i]) { // max가 여러개 존재한다면, 
				ms='?'; 
			}
		}
		
		System.out.println((char)ms);
			
	}
}




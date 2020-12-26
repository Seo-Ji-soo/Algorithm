// 조건에 맞는 문자열을 찾는 문제
/*
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 

예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);  // 메소드 함수를 사용하려면 밖에서 선언.

	public static void main(String[] args) {
		
		
		int n = sc.nextInt(); // 입력해야 될 단어의 갯수 
	
		int count =0; // 그룹단어 갯수 (출력해야될 값)
		
		for(int i=0; i<n; i++) {
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean check() {
		boolean[] check = new boolean [26];   // boolean의 기본값 = false
		String w = sc.next();
		int p =0;
		
		for(int i=0; i<w.length(); i++) {
			int now = w.charAt(i);
			
			if(p!=now) {  // 현재 숫자랑 전의 숫자가 다르니? 네!
				if(check[now-'a']==false) {  // check 배열의 ?번째 인덱스가 false니?(기본적으로 다 false.)
					check[now-'a']=true;  // check 배열의 ?번째 인덱스를 true로 바꿔.
					p=now; // 그리고 지금 현재 숫자를 p변수에담아.
				}else {  // check 배열의 ?번째 인덱스가 true니? 네!  (이전에 연속이 아닌 같은 스펠링이 있었다는 것이므로 그룹함수가 아니라는 증거.)
					return false;  // false를 리턴.
				}
			}else {  // 현재 숫자랑 전의 숫자가 같니? 네!(연속으로 같은 스펠링이니?)
				continue;  // for문 계속 돌리기.
			}
		}

		return true;  // for문이 아무 이상없이 끝났으면 true로 리턴.
	}
}


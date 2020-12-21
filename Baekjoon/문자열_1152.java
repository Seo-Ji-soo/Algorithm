// 단어의 개수를 구하는 문제.
/*
영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] arr = s.split(" "); // 빈칸을 기준으로 나누어 arr배열에 담아줌.
		
		if(arr.length>0) { // 문자열 배열의 길이가 0보다 크다면,
			if("".equals(arr[0])) { //맨 앞부분이 공백일 경우
				System.out.println(arr.length-1);// 문자열 배열 크기에 하나 빼준 상태로 출력
			}else { // 그렇지 않을 경우
				System.out.println(arr.length); // 문자열 배열 크기 그대로 출력
			}
		}else { // 문자열 배열의 길이가 0보다 작다면
			System.out.println("0"); // 0출력.
		}
		
			
	}
}


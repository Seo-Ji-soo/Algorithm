// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();  // 단어 입력.
		
		for(char c='a';c<='z';c++) {
			 // indexOf() : 해당 문자가 처음으로 등장하는 위치를 리턴한다.
			 //             해당 문자열이 없으면 -1을 리턴.
			System.out.print(s.indexOf(c)+" "); 
		}
		
		}
	}

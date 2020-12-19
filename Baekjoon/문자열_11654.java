// 아스키 코드에 대해 알아보는 문제.
/*
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main{
	public static void main (String[] args) throws java.lang.Exception	{
	
	Scanner sc = new Scanner(System.in);
	
	String a = sc.next();
	
	 // String에서 char로 즉,문자열을 잘라 문자로 변환한다.
	 // int타입 변수에 저장함으로써 문자에 대응되는 값. 즉, 아스키코드값을 저장한다.
	int b = a.charAt(0);  
	
    System.out.println(b);
	}
}

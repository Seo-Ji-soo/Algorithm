// 숫자를 뒤집어서 비교하는 문제.
/*
상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 

예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
*/

mport java.util.*;
import java.lang.*;
import java.io.*;


public class Main{
    
   public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String a = sc.next();  // 문자 입력
	String b = sc.next();  // 문자 입력
	
	// StringBuffer에 있는 reverse()함수를 사용하여 뒤집어준 뒤(역순처리해준 뒤), toString으로 문자열 변환.
	// toString으로 문자열 변환을 해준 이유 : StringBuffer은 String과 유사하지만 String형이 아니기때문에. 
	// StringBuffer은 StringBuffer 자료형임. 따라서 toString()을 붙임으로서 String 자료형으로 변환.
	int ai = Integer.parseInt(new StringBuffer(a).reverse().toString()); // 역순으로하여 int형으로 저장.
	int bi = Integer.parseInt(new StringBuffer(b).reverse().toString());
	
    System.out.println(ai>bi?ai:bi);  // 삼항연산자 이용하여 출력
	
	
	}
}

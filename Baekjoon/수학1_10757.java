// 파이썬 같은 언어는 10,000자리 정도의 자연수도 자유롭게 다룰 수 있지만 다른 언어들은 어떻게 풀까?
/*
두 정수 A,B를 입력 받은 후 A+B를 출력하라.

예를 들어 
입력 - 9223372036854775807 9223372036854775808
출력 - 18446744073709551615
*/



import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 // long형 범위를 넘어선 무한대 정수 자료형 BigInteger.
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		BigInteger sum = a.add(b);
		
		System.out.println(sum);
		
		
		
	}
		
}

// X가 한수인지 판별하는 함수를 정의하여 문제를 해결.
/*
*어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 한수란, "각 자리수들이 등차수열을 이루는 수"이다. 
		// 등차수열이란 각 항들이 일정한 차이를 보여주는 수열.
		// 그런데 등차가 보여지기 어려운 한자리와 두자리 숫자인 경우에는 
		// 그 숫자 그대로를 한수로 인정해준다.
		// 110의 경우에 세자리수일때 나올 수 있는 한수가 없기 때문에 
		// 두자리 숫자까지 나온 한수가 전부이므로 숫자가 110일때 한수의 갯수는
		// 한자리 숫자~두자리 숫자(1~99)까지 한수의 갯수 즉, 99개가 답이 된다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(hansoo(n));
		
	}

	private static int hansoo(int n) {
	   int han = 0;   // 한수의 갯수.
		
		int k;  // a의 몇번째 배열에 속하는지.
		
		int[] a = new int [3]; // 세자릿수 숫자를 한자릿수씩 각각 담을 배열 선언.
		
		
		for(int i=1; i<=n;i++) {  // 1보다 크거나 같고, n보다 작거나 같은 한수의 갯수.
			if(i>0 && i<100) {  // 숫자가 두자리 숫자일 경우,
				han++;
			}else if(i<1000) {  // 세자리 숫자일때 한자리 숫자씩 담아줌.
				k=0; int t=i;
				while(t>0) {
					a[k]=t%10;   // 나머지 = 일의자리 숫자임. ex) t=123일때 , a[k]=3
					t=t/10;   // 몫을 다시 t에 저장해 줌. ex)t=12
					k++; 		
				}
				if(a[0]-a[1]==a[1]-a[2]) {  // 만약에 등차 수열을 이루고 있는 수라면
					han++;     // 한수의 갯수 증가.
				}
			}
	     }
		return han;
		}
	}



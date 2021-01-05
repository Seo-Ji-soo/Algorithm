// 2부터 x-1까지 모두 나눠서 x가 소수인지 판별하는 문제1
/*
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			boolean tf = true;   // 소수면 true, 소수가 아니면 false
			
			if(x==1) {
				continue;
			}
			
			for(int j=2; j<x; j++) {
				if(x%j==0) {
					tf=false;
					break;
				}
			}
			
			if(tf) {   // tf가 true이면 
				count++;
			}
			
		}
		
		System.out.println(count);
	}
		
}


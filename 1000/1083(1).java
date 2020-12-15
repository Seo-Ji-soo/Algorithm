// 1083번 문제풀이 방법1.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i%3==0) {
				System.out.println("X");
			}else {
				System.out.println(i);
			}
		}
		
	}
}	
	

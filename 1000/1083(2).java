// 1083번 문제풀이 방법2.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
		    int a = i/10; // 몫구하기
		    int b = i%10; // 나머지구하기
		    
			if(a==3||a==6||a==9) {
				if(b==3||b==6||b==9) {
					System.out.println("XX");
					continue;
				}
				System.out.println("X");
			}else if(b==3||b==6||b==9){
				System.out.println("X");
			}else {
				System.out.println(i);
			}
		}
		
	}
}	
	

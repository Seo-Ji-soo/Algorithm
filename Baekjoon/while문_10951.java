// 입력이 끝날 때까지 A+B를 출력. EOF에 대해 알아보기.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		
		}	
	}

}

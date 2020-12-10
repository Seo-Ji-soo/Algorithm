//

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int [10];
		
		// 중복 되는 원소를 넣을 경우 하나만 저장하는 HashSet을 생성.
		HashSet<Integer> a = new HashSet<Integer>(); 
		
		for(int i=0; i<n.length; i++) {
			// n[i]배열 입력 받기.
			n[i]=sc.nextInt();
			
			// 나머지 값 HashSet에 값 넣어주기.
			a.add(n[i]%42);
			
			continue;
		}
		
	   System.out.println(a.size());  // 중복값 제거 한 후의 a의 크기 출력.
		
	}

		
}


// 10818번 풀이방법3.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 정수 갯수 입력
		
		int[] n = new int [num];

		
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
		}
		   // 배열 정렬.
       // Arrays.sort()의 인자로 배열을 전달하면 오름차순으로 정렬해줌.
       // 내림차순으로 정렬하고 싶으면--> Arrays.sort(n,Collections.reverseOrder())
        Arrays.sort(n);
        
       
        int min = n[0];
        int max = n[n.length-1];
		
		System.out.print(min + " " + max);
	
	}

}

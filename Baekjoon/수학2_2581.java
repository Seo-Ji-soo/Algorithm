// 2부터 x-1까지 모두 나눠서 x가 소수인지 판별하는 문제2
/*
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 
이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 
61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
이들 소수의 합은 620이고, 최솟값은 61이 된다.

입력 - 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
       M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
       
출력 - M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.    
       단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		int min = 10001;  // 최솟값을 담을 변수에 가장 큰수를 담아서 비교하여 가장 작은 수를 담는다.
		int count = 0; // 소수가 아닌것 카운트 세기
		
		for(int i=m; i<=n; i++) {
		  	for(int j=2; j<i; j++) {
		  		if(i%j==0) // 소수가 아닌 수
		  		    count++;

		  	}	
	  		if(count==0 && i!=1) {  // 소수가 아니면 count숫자는 0이 아니므로 count가 0이고 i가 1이 아닌 수는 = 소수.
	  			sum+=i;    // 즉, 소수이면 합하라.
	  			if(min>i)  // 소수중에서 작은 수를 구하라.
	  				min=i;
	
	  		}
		  	count=0;
		}
		 
	   if(min==10001) {  // 소수가 없으면 -1 출력인데 min을 10001로 하면 전에 소수가 하나도 없다는 뜻이므로 이렇게 코드를 짜줌.
		   System.out.println("-1");
	   }else {
		System.out.println(sum);
		System.out.println(min);
	   }
	}
		
}


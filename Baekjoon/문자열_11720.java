import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   // 입력 갯수 입력받기
		
		String num = sc.next();  // 문자열 입력

		String[] a =num.split(""); // 문자열 각각 하나씩 문자열배열에 저장.
		
		int sum=0;   // 숫자들의 합 저장해줄 변수 생성.
		
		// 문자열 각각 하나씩 저장한 것들 더하기
		for(int i=0;i<n;i++) {
			sum+=Integer.parseInt(a[i]);
		}
		
		System.out.println(sum);
		}
	}

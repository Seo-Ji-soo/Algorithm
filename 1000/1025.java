import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 입력을 받기
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		// name을 담을 배열
	    String[] alphabet;

	    // 배열에 한글자씩 저장
	    alphabet = name.split("");

		// 한글자씩 출력
	    for(int i=0; i<alphabet.length;i++) {
	    	System.out.print("["+alphabet[i]);
	    
	    
	    for(int j=alphabet.length-1; j>i; j--) {   //4부터 시작해서 1이 될때까지 -1씩해서 출력
	    	System.out.print("0");
	    }
		
	    System.out.println("]");
	    }
	}

}


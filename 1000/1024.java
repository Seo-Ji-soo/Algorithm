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
	    	System.out.println("'"+alphabet[i]+"'");
	    }
		
	
	}

}

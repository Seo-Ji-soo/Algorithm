import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        String a = sc.next();
        
        // a의 문자를 16진수로 변환하여 int형(10진수)으로 반환.
        int b = Integer.valueOf(a,16);
        
        for(int i=1; i<16; i++) {
        	// Integer.toHexString() = 10진수를 16진수로 변환. 
        	// toUpperCase()=기본값은 알파벳 소문자 이므로 이 함수를 사용하여 대문자로 변환.
        String i1 = Integer.toHexString(i).toUpperCase();
        String mul = Integer.toHexString(i*b).toUpperCase();
        
        System.out.println(a + "*"+i1+"="+mul);
        }
	}
}	

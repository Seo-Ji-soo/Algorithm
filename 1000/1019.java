import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String a;
		
		a=sc.next();
		
		String[] time = a.split("\\."); // 온점은 메타문자이기 때문에 앞에 슬래시 2번을 해줘야 인식이 됨.
		
		int b = Integer.parseInt(time[0]);
		int c = Integer.parseInt(time[1]);
		int d = Integer.parseInt(time[2]);
	
		
		System.out.printf("%04d.%02d.%02d",b,c,d);
		
	}

}


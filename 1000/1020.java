import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String a;
		
		a=sc.next();
		
		String[] time = a.split("-");  
		
		int b = Integer.parseInt(time[0]);
		int c = Integer.parseInt(time[1]);

	
		
		System.out.printf("%06d%07d",b,c);
		
	}

}


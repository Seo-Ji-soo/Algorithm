import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String a;
		
		a=sc.next();
		
		String[] b = a.split("\\.");
		
		int c = Integer.parseInt(b[0]);
		int d = Integer.parseInt(b[1]);
		


	
		
		System.out.printf("%d\n",c);
		System.out.printf("%d",d);
		
	}

}

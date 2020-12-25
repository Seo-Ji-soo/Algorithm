import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long w = sc.nextLong();
		long h = sc.nextLong();
		long b = sc.nextLong();

		
		float total = ((w*h*b)/8/1024)/1024f;
		
		System.out.printf("%.2f MB",total);
				
		
	}
}	
	


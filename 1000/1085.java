import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long s = sc.nextLong();
		
		float total = ((h*b*c*s)/8/1024)/1024f;
		
		System.out.printf("%.1f MB",total);
				
		
	}
}	
	


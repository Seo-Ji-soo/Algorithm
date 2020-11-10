import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		

	    String[] a;


	    a= time.split("\\.");
	    
	 
	    System.out.printf("%s-%s-%s",a[2],a[1],a[0]);
	    	
	}
}

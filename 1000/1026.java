import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		

	    String[] a;


	    a= time.split(":");
	    
	    int min = Integer.parseInt(a[1]);
	   
	    if(min<=9) {
	    	System.out.printf("%1d",min);
	    }else
	    	System.out.printf("%d",min);
	    	

	    
	    
	}	  
}


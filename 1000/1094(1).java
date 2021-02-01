import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		   
		    int n = sc.nextInt();
		    sc.nextLine(); // 엔터 처리
	        String b = sc.nextLine();
	        
	        String [] a =  b.split(" ");
	        
	        for(int i=n-1;i>=0;i--) {
	        	System.out.print(a[i]+ " ");
	        }


	       
	    }

	}
	

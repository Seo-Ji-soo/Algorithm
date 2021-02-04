import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		   
		    int n = Integer.valueOf(bf.readLine());
		    
	        String b = bf.readLine();
	        
	        String [] a =  b.split(" ");
	      
	        int min = Integer.parseInt(a[0]);
	        
	        for(int i=0;i<n;i++) {
	        	
	        	
	        	if(min>Integer.parseInt(a[i])) {
	        		min=Integer.parseInt(a[i]);
	        	}
	        	
	        }
	        System.out.println(min);


	       
	    }

	}
	

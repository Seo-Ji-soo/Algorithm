import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
    int a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();
    long [] s = new long [n];
    s[0] = a;
    
    for(int i=1; i<n; i++) {
    	s[i]=s[i-1]*r;
    	
    	 
    
    }
    
    System.out.println(s[n-1]);
		
	}
}	
	


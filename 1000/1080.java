import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int sum=0;

		for(int i=0;i<=1000;i++) {
			sum+=i;
		    if(sum>=a) {
		    	System.out.println(i);
		    	break;
		    }
			
		}

    }
}	

	

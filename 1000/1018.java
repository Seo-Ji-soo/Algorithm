import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String a;
		
		a=sc.nextLine();
		
		String[] time = a.split(":");

	
		
		System.out.printf("%d:%d",Integer.parseInt(time[0]),Integer.parseInt(time[1]));
		
	}

}

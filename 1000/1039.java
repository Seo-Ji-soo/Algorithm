import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String[] num = a.split(" ");
		
		long b = Long.parseLong(num[0]);
		long c = Long.parseLong(num[1]);
	
		
		System.out.print(b+c);
			

	}
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		
		if(a%2==0) {
			if(a<0) {
				System.out.println("minus");
			}else {
				System.out.println("plus");
			}
			System.out.println("even");
		}else {
			if(a<0) {
				System.out.println("minus");
			}else {
				System.out.println("plus");
			}
			System.out.println("odd");
		}

	}
}


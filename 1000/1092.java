import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int day = 1;
	
	while(true) {
		if(day%a==0&day%b==0&day%c==0) {
			System.out.println(day);
			break;
		}else {
			day++;
		}
	}
	
	
	}
}	
	


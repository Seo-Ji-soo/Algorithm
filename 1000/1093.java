import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt(); // 몇개?? 10입력.
	int [] arr = new int [24];
	
	for(int i = 0; i<n; i++){ // n번째로 돌린다.
            int num = sc.nextInt(); // n개의 숫자 막 입력 가능.
        //ex) num = 2 2 6 3 6

            arr[num-1] += 1;
        }

	for(int i = 0; i<23; i++){
           System.out.print(arr[i] + " ");
	}
    }
}	
	

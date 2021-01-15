// 피타고라스의 정리에 대해 배우는 문제.
/*
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

입력 - 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 

출력 - 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {		
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			int[] arr = {x,y,z};
			
      // Arrays.sort() : 배열을 정렬해주는 함수.
			Arrays.sort(arr); //  배열 정렬을 통해 z값이 가장 크다는 것을 명시해줌.
			
			if(x==0&&y==0&&z==0) {
				break;
			}else {
				// Math.pow(대상숫자,지수) : 거듭 제곱수를 구하는 함수. 이 메소드는 입력값,출력값 모두 double형. 
				int xx = (int)Math.pow(arr[0], 2);
				int yy = (int)Math.pow(arr[1], 2);
				int zz = (int)Math.pow(arr[2], 2);
				
			
				if(xx+yy==zz) { // 작은 값 2개 더한 값과 가장큰 값이 같아야 함.
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
			
		}
		
			   }//메인메소드종료 
		
		}//클래스종료


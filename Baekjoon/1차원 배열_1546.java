// 평균을 조작하는 문제.
/*
*세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 
수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();   // 시험에서 본 과목의 개수

		int[] an = new int [n];   // 시험 점수 배열 선언.
		
		double[] ann = new double [n]; // an[i]/m*100 담을 변수 선언.
		
		double sum = 0; // an[i]/m*100 의 합 담는 변수 선언.
		
		double avg = 0; // 새로운 평균 값 담는 변수 선언.


		for(int i=0; i<an.length;i++){
		 an[i] = sc.nextInt();   // 시험 점수 입력 받기.
	    }
		
		int m = an[0];  // 점수 중에서 최댓값 담을 변수 초깃값 설정.
		
    // 배열 중에서 최댓값 구하기.
		for(int i=0; i<an.length;i++) {
			if(m<an[i]) {
				m=an[i];	
			}
		}

		for(int i=0; i<an.length; i++) {
			ann[i]=(double)an[i]/m*100;
			sum+=ann[i];
			continue;
		}
		
		//#으로 표기하면 0이면 안 나타나고, 0으로 표기하면 0일때도 나타남.
		DecimalFormat f = new DecimalFormat("#0.0#");   
		
    // 새로운 평균 값 구하기.
		avg = sum/an.length;
		
		String avg2 = f.format(avg);  //format함수는 문자열로 변환해 주는 함수.
		
		System.out.print(avg2);

    }
}

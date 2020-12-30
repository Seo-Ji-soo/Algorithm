// 달팽이의 움직임을 계산하는 문제.
/*
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
또, 정상에 올라간 후에는 미끄러지지 않는다.
달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

예를들어
입력) 2 1 5     출력) 4
입력) 5 1 6     출력) 2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// BufferedReader로 쓰려면 String으로 입력 받아야 하므로 
		// String으로 입력 받고 띄어쓰기 기준으로 배열에 담아준뒤 
		// int형으로 각각 a,b,v 에 담아줌.
		String s = bf.readLine();
		String[] arrs = s.split(" ");
		
		int a = Integer.parseInt(arrs[0]);  // 낮에 올라가는 미터 수.
		int b = Integer.parseInt(arrs[1]);   // 밤에 미끄러지는 미터 수.
		int v = Integer.parseInt(arrs[2]);  // 달팽이가 올라야하는 총 미터.
		
		
		// v-b = 정상에서 달팽이가 더 올라가야 될 남은 높이
		// a-b = 그날 총 올라간 길이
		int day=(v-b)/(a-b); // 총 날짜.
		
		if((v-b)%(a-b)!=0) {
			day++;
		}
		
		System.out.println(day);
		
	}
		
}


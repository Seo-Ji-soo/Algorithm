// 크로아티아 알파벳의 개수를 세는 문제
/*
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

c=, c-, dz=, d-, lj, nj, s=, z=   ---> 이것들을 각각 1개로 쳐서 개수 세기.

예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;   // 갯수를 세서 출력할 값 초깃값 설정.
		
		String a = sc.next();  // 입력받을 문자열.
		
		String[] c = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<c.length;i++) {
			// a 문자열에서 c[i]째에 존재하는 것을 x로 교체하여라. 그리고 a에 담아줘라.
			a = a.replace(c[i],"x"); 
		}
		
		// a문자열의 길이를 출력하라.
		System.out.println(a.length());

	}
}


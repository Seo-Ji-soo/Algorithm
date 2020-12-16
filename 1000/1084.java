import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// 입력 ---> String이 중심이 됨.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 출력 ---> String이 중심이됨.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*안되는 이유: 입력할 때 띄어쓰기를 String으로 인식. 
		 * int r = Integer.parseInt(bf.readLine());
		   int g = Integer.parseInt(bf.readLine());
		   int b = Integer.parseInt(bf.readLine());*/
		
		// String형에 입력한 숫자 2 2 2 담아줌.
		String a = bf.readLine();
		// a를 띄어쓰기를 중심으로 잘라서 하나씩 배열에 담아줌. 즉, b[0]=2,b[1]=2,b[2]=2
		String[] b = a.split(" ");
		//최종 갯수 초기화.
		int count = 0;
		
		for(int i=0;i<Integer.valueOf(b[0]);i++) {
			for(int j=0;j<Integer.valueOf(b[1]);j++) {
				for(int n=0;n<Integer.valueOf(b[2]);n++) {
					bw.write(i+" "+j+ " "+n+"\n");
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));  // count는 숫자이므로 String으로 변환.
		bw.flush();
	}
}	
	

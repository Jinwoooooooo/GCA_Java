package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test06 {
	public static void main(String[] args) throws IOException {
		
		//reader, writer 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int time = Integer.parseInt(br.readLine());
		
		for(int i=0; i<time; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
		}
		
        // 버퍼 비우기 및 종료
        br.close();
        bw.flush();
        bw.close();

	}
}


//br.read()는 문자 하나를 읽어서 int ASCII 값으로 반환함.

//br.readLine()을 사용하여 한 줄 전체를 읽음.
//int a = Integer.parseInt(br.readLine()); 이렇게 작성함으로써 
//br.readLine()을 정수 a로 받을 수 있음.

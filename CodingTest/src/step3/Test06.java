package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test06 {
	public static void main(String[] args) throws IOException {
		
		//reader, writer 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int time = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0; i<time; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			sum = a + b;
			bw.write(sum);
			System.out.println();
		}
		
        // 버퍼 비우기 및 종료
        bw.flush();
        br.close();
        bw.close();

	}
}

//br.read()는 문자 하나를 읽어서 int ASCII 값으로 반환함.

//br.readLine()을 사용하여 한 줄 전체를 읽고, 이를 정수로 변환.
//int a = Integer.parseInt(br.readLine());

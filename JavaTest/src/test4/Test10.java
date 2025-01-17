package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\jinwo\\OneDrive\\바탕 화면\\Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2; x<=9; x++) {
				fw.write("-------- " + x + "단 --------\n");
				
				for(int y=1; y<=9; y++) {
					fw.write(x + " X " + y + " = " + x*y + "\n");
				}
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("구구단 파일 생성 완료...");
	}
}

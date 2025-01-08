package step3;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nByte = sc.nextInt();
		
		String nlong = "long";
		String space = " ";
		String nint = "int";
		
		for(int i=0; i<nByte/4; i++) {
			System.out.print(nlong + space);
		}
		System.out.println(nint);
	}
}

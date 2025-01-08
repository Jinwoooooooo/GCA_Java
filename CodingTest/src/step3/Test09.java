package step3;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		for(int i=0; i<time; i++) {
			for(int j=0; j<=i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
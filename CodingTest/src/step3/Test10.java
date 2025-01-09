package step3;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		for(int i=0; i<time; i++) {
			for(int j=time-1; j>i; j--) {				
				System.out.print(" ");
			}
			for(int k=0; k<time; k++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
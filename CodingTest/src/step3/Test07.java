package step3;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		for(int i=1; i<time+1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (a + b));
		}
	}
}

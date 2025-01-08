package step3;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int[] sum = new int[time];
		
		for(int i=0; i<time; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a + b;
		}
		
		for(int i=0; i<sum.length; i++) {			
			System.out.println(sum[i]);
		}
	}
}

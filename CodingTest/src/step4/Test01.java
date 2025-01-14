package step4;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int count = 0;
		int[] rs = new int[time];
		
		for(int i=0; i<time; i++) {
			int number = sc.nextInt();
			rs[i] = number;
		}
		
		int wanted = sc.nextInt();
		
		for(int j=0; j<rs.length; j++) {			
			if(wanted == rs[j]) {
				count++;
			}
		}
		System.out.println(count);
	}
}

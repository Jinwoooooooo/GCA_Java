package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int add = sc.nextInt();
		
		if(h == 0) {
			h = 24;
			if(m >= 60) {
				h += 1;
				m = m + (m-60);
			} else {
				
			}
		}
	}
}

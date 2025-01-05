package step2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h == 0) {
			h = 24;
			if(m >= 45) {
				h = 0;
				m -= 45;
			} else {
				h -= 1;
				m = 60 + (m-45);
			}
		}  else {
			if(m >= 45) {
				m -= 45;
			} else {
				h -= 1;
				m = 60 + (m-45);
			}
		}
		System.out.println(h + " " + m);
	}
}

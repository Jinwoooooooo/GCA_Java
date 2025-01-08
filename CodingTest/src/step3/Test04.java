package step3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int kind = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<kind; i++) {
			int price = sc.nextInt();
			int item = sc.nextInt();
			sum += price * item;
		}
		
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

package step3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int kind = sc.nextInt();
		int price = sc.nextInt();
		int item = sc.nextInt();
		
		if(price * item == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

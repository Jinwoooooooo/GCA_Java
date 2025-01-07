package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gugu = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(gugu + " * " + i + " = " + gugu*i);
		}
	}
}

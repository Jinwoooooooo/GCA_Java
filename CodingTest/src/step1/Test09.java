package step1;

/*
 * 날짜 : 2025/01/03
 * 이름 : 정진우
 * 내용 : 백준 1단계 9번
 */


import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b%c));
		System.out.println(((a%c)*(b%c)%c));
	}
}

package test1;

import java.util.Scanner;

/*
 * 날짜 : 2025/01/03
 * 이름 : 정진우
 * 내용 : 자바 삼항연산자 연습문제
 */

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("Y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "X가 더 큽니다." : "Y가 더 큽니다.";
		
		System.out.println(result);
	}
}

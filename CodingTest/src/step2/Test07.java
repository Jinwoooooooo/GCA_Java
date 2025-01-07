package step2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int prizeMoney;
		int total;
		int max;
		
		if(first == second && second == third && first == third) {
			total = (first + second + third) / 3;
			prizeMoney = 10000 + total * 1000;
			System.out.println(prizeMoney);
		} else if(first == second) {
			total = (first + second) / 2;
			prizeMoney = 1000 + total * 100;
			System.out.println(prizeMoney);
		} else if(second == third) {
			total = (second + third) / 2;
			prizeMoney = 1000 + total * 100;
			System.out.println(prizeMoney);
		} else if(first == third) {
			total = (first + third) / 2;
			prizeMoney = 1000 + total * 100;
			System.out.println(prizeMoney);
		} else if(first > second && first > third) {
			max = first;
			prizeMoney = max * 100;
			System.out.println(prizeMoney);
		} else if(second > first && second > third) {
			max = second;
			prizeMoney = max * 100;
			System.out.println(prizeMoney);
		} else if(third > first && third > second) {
			max = third;
			prizeMoney = max * 100;
			System.out.println(prizeMoney);
		}
	}
}

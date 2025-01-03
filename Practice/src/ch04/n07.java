package ch04;

import java.util.Scanner;

public class n07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택 : ");
			String num = sc.nextLine();
			
			
			switch(num) {
			case "1": 
				System.out.print("예금액 : ");
				int plus = sc.nextInt();
				sc.nextLine();
				if(money == 0) {
					money = plus;
				} else {					
					money += plus;
				}
				break;
			case "2":
				System.out.print("출금액 : ");
				int minus = sc.nextInt();
				sc.nextLine();
				if(money == 0) {
					System.out.println("출금할 수 있는 잔액이 없습니다.");
				} else {					
					money -= minus;
				}
				break;
			case "3":
				System.out.println("잔고 : " + money);
				break;
			case "4":
				System.out.println("프로그램 종료");
				sc.close();
				return;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
}

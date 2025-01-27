package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
	private static Scanner sc = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			
			
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				isRunning = false;
			} else {
				System.out.println("잘못된 번호를 입력했습니다.");
				continue;
			}
		}
		System.out.println("프로그램 종료.");
	}
	
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String ano = sc.nextLine();
		
		System.out.print("계좌주 : ");
		String owner = sc.nextLine();
		
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(sc.nextLine());
		
		Account ac = new Account(ano, owner, balance);
		accounts.add(ac);
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	private static void accountList() {
		for(Account ac : accounts) {
			System.out.println(ac.getAno()+ " " + ac.getOwner() + " " + ac.getBalance());
		}
	}
	
	private static void deposit() {
		System.out.print("계좌번호 : ");
		String ano = sc.nextLine();
		
		Account ac = findAccount(ano);
		
		try {
			if(ano.equals(ac.getAno())) {
				System.out.print("입금액 : ");
				int plus = Integer.parseInt(sc.nextLine());
				ac.setBalance(ac.getBalance() + plus);
				System.out.println("예금이 성공되었습니다.");
			}
		} catch(NullPointerException e) {
			System.out.println("없는 계좌번호입니다.");
		}
		
	}
	
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = sc.nextLine();
		
		Account ac = findAccount(ano);
		
		try {			
			if(ano.equals(ac.getAno())) {
				System.out.print("출금액 : ");
				int minus = Integer.parseInt(sc.nextLine());
				
				if(ac.getBalance() < minus) {
					System.out.println("예금액보다 많은 금액을 입력했습니다. (출금 실패)");
				} else {
					ac.setBalance(ac.getBalance() - minus);
					System.out.println("출금이 성공되었습니다.");					
				}
			}
		} catch(NullPointerException e) {
			System.out.println("없는 계좌번호입니다.");
		}
	}
	
	private static Account findAccount(String ano) {
		for(Account ac : accounts) {
			if(ano.equals(ac.getAno())) {				
				return ac;
			}
		}
		return null;
	}
}

package main;

import java.util.Scanner;

import controller.CustomerController;
import controller.OrderController;
import controller.ProductController;

/*
 * 날짜 : 2025/01/31
 * 이름 : 정진우
 * 내용 : JAVA Shop 미니 프로젝트 실습
 * 
 * Controller
 *  - 사용자의 요청을 처리하는 컴포넌트
 *  - 일반적으로 사용자의 입력값을 서비스로 전달
 *  
 * Service
 *  - Controller와 DAO 사이에 중간 처리 역할
 *  - 비즈니스 처리 담당
 *  
 * DAO
 *  - Data Access Object
 *  - 데이터베이스 테이블 CRUD 처리 담당
 */

public class AppMain {
	public static void main(String[] args) {
		
		CustomerController cc = new CustomerController();
		ProductController pc = new ProductController();
		OrderController oc = new OrderController();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.println("=========== Shop 미니 프로젝트 ===========");
			System.out.println("0 : 종료 | 1 : 회원관리 | 2 : 상품관리 | 3 : 주문관리");
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			switch(answer) {
			case 0:
				isRunning = false;
				break;
			case 1:
				//회원관리
				cc.manage(sc);
				break;
			case 2:
				//상품관리
				pc.manage(sc);
				break;
			case 3:
				//주문관리
				oc.manage(sc);
				break;
			default:
				System.out.println("잘못 선택했습니다. 다시 선택하세요.");
				break;
			}
		}
		
		sc.close();
		System.out.println("프로그램 종료...");
	}
}

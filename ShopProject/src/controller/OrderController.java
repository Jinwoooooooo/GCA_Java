package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Customer;
import entity.Order;
import service.OrderService;

public class OrderController {
	
	private OrderService service = OrderService.getInstance();
	
	public void manage(Scanner sc, Customer loginedCustomer) {
		while(true) {
			System.out.println("---------- 주문관리 ----------");
			System.out.println("0 : 메인 | 1 : 주문하기 | 2 : 주문목록 | 3 : 나의주문");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				//메인 이동
				return;
			case 1:
				//주문하기
				if(loginedCustomer != null) {
					Order inputOrder = inputOrder(sc, loginedCustomer);
					service.makeOrder(inputOrder);
					System.out.println("주문이 완료되었습니다.");
				} else {
					System.out.println("회원만 주문 가능합니다.");
				}
 				break;
			case 2:
				//주문목록
				List<Order> orders = service.viewOrders();
				for(Order order : orders) {
					order.showOrder();
				}
				break;
			case 3:
			    // 나의 주문
			    if (loginedCustomer != null) {
			        List<Order> myOrders = service.myOrder(loginedCustomer.getCustId());
			        
			        if (myOrders.isEmpty()) {
			            System.out.println("주문 내역이 없습니다.");
			        } else {
			            for (Order order : myOrders) {
			                order.showOrder();
			            }
			        }
			        
			    } else {
			        System.out.println("회원만 확인 가능합니다.");
			    }
			    break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	public Order inputOrder(Scanner sc, Customer loginedCustomer) {
		String orderId = loginedCustomer.getCustId();
		
		System.out.println("상품번호 : ");
		int orderProduct = sc.nextInt();
		
		System.out.println("주문수량 : ");
		int orderCount = sc.nextInt();
		
		return new Order(orderId, orderProduct, orderCount);
	}
}

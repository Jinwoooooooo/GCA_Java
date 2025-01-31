package controller;

import java.util.List;
import java.util.Scanner;

import entity.Product;
import service.ProductService;


public class ProductController {
	
	private ProductService service = ProductService.getInstance();
	
	public void manage(Scanner sc) {
		
		while(true) {
			System.out.println("---------- 상품관리 ----------");
			System.out.println("0 : 메인 | 1 : 상품등록 | 2 : 상품목록 | 3 : 상품검색");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				//메인 이동
				return;
			case 1:
				//상품등록
				Product inputProduct = inputProduct(sc);
				service.registerProduct(inputProduct);
				System.out.println("상품등록이 완료되었습니다.");
				break;
			case 2:
				//상품목록
				List<Product> productList = service.viewProducts();
				for(Product product : productList) {
					product.showProduct();
				}
				break;
			case 3:
				// 상품 검색
			    String searchProduct = searchProduct(sc);
			    Product sp = service.searchProduct(searchProduct);
			    
			    if (sp != null) {
			       sp.showProduct();
			    } else {
			       System.out.println("없는 상품입니다.");
			    }
			    break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	public Product inputProduct(Scanner sc) {
		sc.nextLine();
		System.out.print("제품명 : ");
		String prodName = sc.nextLine();
		
		System.out.print("재고 : ");
		int stock = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("제조사 : ");
		String company = sc.nextLine();
		
		return new Product(prodName, stock, price, company);
	}
	
	public String searchProduct(Scanner sc) {
		sc.nextLine();
		System.out.print("상품명을 입력하세요. : ");
		String prodName = sc.nextLine();
				
		return prodName;
	}
}

package entity;

public class Product {
	private int prodNo;
	private String prodName;
	private int stock;
	private int price;
	private String company;
	
	public Product(int prodNo, String prodName, int stock, int price, String company) {
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}
	
	public Product(String prodName, int stock, int price, String company) {
		this.prodName = prodName;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}
	
	public Product(String prodName) {
		this.prodName = prodName;
	}

	public Product() {}
	
	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showProduct() {
		System.out.println("------------------------");
		System.out.println("| 상품번호 : " + prodNo + "\n| 상품명 : " + prodName + "\n| 재고 : " + stock + "\n| 가격 : " + price + "\n| 제조사 : " + company);
		System.out.println("------------------------");
	}
	
	@Override
	public String toString() {
		return "| 상품번호 : " + prodNo + "\n| 상품명 : " + prodName + "\n| 재고 : " + stock + "\n| 가격 : " + price + "\n| 제조사 : " + company;
	}
}

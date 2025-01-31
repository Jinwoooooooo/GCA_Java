package service;

import java.util.List;

import dao.ProductDAO;
import entity.Product;

public class ProductService {
	
	private static final ProductService INSTANCE = new ProductService();
	
	public static ProductService getInstance() {
		return INSTANCE;
	}
	
	private ProductService() {}
	
	//DAO 객체
	private ProductDAO dao = ProductDAO.getInstance();
	
	//상품등록
	public void registerProduct(Product product) {
		dao.insertProduct(product);
	}
	
	//상품목록
	public List<Product> viewProducts() {
		return dao.viewProducts();
	}
	
	//상품목록
	public Product searchProduct(String prodName) {
		return dao.searchProduct(prodName);
	}
}

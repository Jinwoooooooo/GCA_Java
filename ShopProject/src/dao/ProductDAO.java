package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Customer;
import entity.Product;

public class ProductDAO extends DBHelper {
	
	//싱글톤
	private static final ProductDAO INSTANCE = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return INSTANCE;
	}
	
	private ProductDAO() {}
	
	public void insertProduct(Product product) {
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			pstmt.setString(1, product.getProdName());
			pstmt.setInt(2, product.getStock());
			pstmt.setInt(3, product.getPrice());
			pstmt.setString(4, product.getCompany());
			pstmt.executeUpdate();
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Product> viewProducts() {
		
		List<Product> products = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				Product product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				products.add(product);
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	public Product searchProduct(String prodName) {
		
		Product product = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			pstmt.setString(1, prodName);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}
}

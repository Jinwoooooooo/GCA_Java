package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Customer;

public class CustomerDAO extends DBHelper {
	
	//싱글톤
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
		return INSTANCE;
	}
	
	private CustomerDAO() {}
	
	//기본 CRUD
	public void insertCustomer(Customer customer) {
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			pstmt.setString(1, customer.getCustId());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getHp());
			pstmt.setString(4, customer.getAddr());
			pstmt.executeUpdate();
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Customer selectCustomer(String custId) {
		
		Customer customer = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			pstmt.setString(1, custId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				customer = new Customer();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return customer;
	}
	
	public List<Customer> viewCustomers() {
		
		List<Customer> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(SQL.SELECT_CUSTOMERS);
			
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
				list.add(customer);
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void updateCustomer(Customer customer) {
		
	}
	
	public void deleteCustomer(String custId) {
		
	}
	
}

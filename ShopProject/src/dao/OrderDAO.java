package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Customer;
import entity.Order;
import entity.Product;

public class OrderDAO extends DBHelper {
	
	private static final OrderDAO INSTANCE = new OrderDAO();
	
	public static OrderDAO getInstance() {
		return INSTANCE;
	}
	
	private OrderDAO() {}
	
	public void insertOrder(Order order) {
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.INSERT_ORDER);
			pstmt.setString(1, order.getOrderId());
			pstmt.setInt(2, order.getOrderProduct());
			pstmt.setInt(3, order.getOrderCount());
			pstmt.executeUpdate();
			closeAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Order> myOrder(String orderId) {

		List<Order> orderList = new ArrayList<>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.SELECT_MY_ORDER);
			pstmt.setString(1, orderId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Order order = new Order();
				order.setOrderNo(rs.getInt(1));
				order.setProdName(rs.getString(2));
				order.setOrderCount(rs.getInt(3));
				order.setPrice(rs.getInt(4));
				order.setTotal(rs.getInt(5));
				order.setOrderDate(rs.getString(6));
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return orderList;
	}
	
	public List<Order> viewOrders() {
		
		List<Order> orderList = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_ORDERS);
			
			while(rs.next()) {
				Order order = new Order();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setProdName(rs.getString(3));
				order.setOrderCount(rs.getInt(4));
				order.setPrice(rs.getInt(5));
				order.setTotal(rs.getInt(6));
				order.setOrderDate(rs.getString(7));
				orderList.add(order);
			}
			closeAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return orderList;
	}
	
	public void updateOrder(Order order) {
		
	}
	
	public void deleteOrder(int orderNo) {
		
	}
	
	

}

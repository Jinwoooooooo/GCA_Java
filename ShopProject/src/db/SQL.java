package db;

public class SQL {
	
	//customer
	public static final String INSERT_CUSTOMER = "INSERT INTO Customer VALUES(?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM Customer WHERE custId = ?";
	public static final String SELECT_CUSTOMERS = "SELECT * FROM Customer";
	
	
	//order
	public static final String INSERT_ORDER = "INSERT INTO `Order` SET " + "orderId = ?," + "orderProduct = ?," + "orderCount = ?," + "orderDate = NOW()";
	public static final String SELECT_MY_ORDER = "SELECT "
												+ "orderNo,"
												+ "orderId,"
												+ "prodName,"
												+ "orderCount,"
												+ "price,"
												+ "orderCount * price as total,"
												+ "orderDate "
												+ "from `order` as a "
												+ "join product as b on a.orderProduct = b.prodNo;";
	public static final String SELECT_ORDERS = "SELECT "
												+ "orderNo,"
												+ "orderId,"
												+ "prodName,"
												+ "orderCount,"
												+ "price,"
												+ "orderCount * price as total,"
												+ "orderDate "
												+ "from `order` as a "
												+ "join product as b on a.orderProduct = b.prodNo;";
	
	//product
	public static final String INSERT_PRODUCT = "INSERT INTO Product SET " + "prodName = ?," + "stock = ?," + "price = ?," + "company = ?";
	public static final String SELECT_PRODUCT = "SELECT * FROM Product WHERE prodName = ?";
	public static final String SELECT_PRODUCTS = "SELECT * FROM Product";
	
}

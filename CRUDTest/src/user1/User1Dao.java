package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * DAO 클래스
 *  - Data Access Object
 *  - 데이터베이스 테이블 CRUD 처리 객체
 */

public class User1Dao {
	
	//싱글톤
	private static User1Dao instance = new User1Dao();
	
	public static User1Dao getInstance() {
		return instance;
	}

	public User1Dao() {}
	
	//DB정보
	private final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	//커넥션
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	//리소스
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//기본 CRUD 메소드
	public void insertUser1(User1 user) {
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.INSERT_USER1);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getHp());
			pstmt.setInt(4, user.getAge());
			
			pstmt.executeUpdate();
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public User1 selectUser1(String uid) {
		
		User1 user = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.SELECT_USER1);
			pstmt.setString(1, uid);
			
			rs = pstmt.executeQuery();
			
			//SELECT의 결과가 0또는 1이기 때문에 while 대신 if문으로 결과 처리
			if(rs.next()) {
				user = new User1();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User1> selectUser1List() {
		
		List<User1> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER1_LIST);
			
			while(rs.next()) {
				User1 user = new User1();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
				list.add(user);
			}
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void updateUser1(User1 user) {
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.UPDATE_USER1);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getHp());
			pstmt.setInt(4, user.getAge());
			
			pstmt.executeUpdate();
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser1(String uid) {
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(SQL.DELETE_USER1);
			pstmt.setString(1, uid);
			pstmt.executeUpdate();
			closeAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	//통합 close 메소드
	public void closeAll() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(pstmt != null) {
			pstmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
}

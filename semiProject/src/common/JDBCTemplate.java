package common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCTemplate {
	//1. Connection 이 필요할 때마다 직접 데이터베이스 서버에
	//접속해서 연결 요청함
	/*public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"student", "student");
			conn.setAutoCommit(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}*/
	
	//2.
	
	//3. 톰켓이 제공하는 DBCP(DataBase Connection Pool)를
	//이용해서 연결 처리
	//content directory/META-INF/context.xml 파일에 설정됨
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			//context.xml 에 설정된 <Resource> 앨리먼트의
			//설정값을 읽어와서, DBCP 에서 Connection 받음
			Context initContext = new InitialContext();
			DataSource ds = (DataSource)initContext.lookup(
					"java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}	
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package jdbcPjt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class DBUtil {
	
	/* �����ͺ��̽��� ���� ����Ǿ� �ִ� Properties ����  ���(������ ��ΰ� �����ڹٿ� �޶� ���� �����Ͽ� ����ϱ� ������ ������) */	
//	private static Properties dbInfo = new Properties();
//	
//	public static Properties getProp() {
//		return dbInfo;
//	}
	
	private static DataSource dataSource;
	
	/* �ε� */
	static { //���� �Լ����� ���� �����
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:comp/env");
			dataSource = (DataSource)envContext.lookup("jdbc/Oracle11g");
			
			
//			dbInfo.load(new FileInputStream("dbInfo.properties"));
//			Class.forName(dbInfo.getProperty("driverName"));	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/* ���� */
	public static Connection getConnection() throws SQLException{
		
		
		return dataSource.getConnection();
//		return DriverManager.getConnection(dbInfo.getProperty("url"), 
//				dbInfo.getProperty("user"), 
//				dbInfo.getProperty("password"));
	}
	
	/* �ݱ� */
	public static void dbClose(Connection con, Statement st) {
		try {
			if(st != null)
				st.close();
			if(con != null)
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void dbClose(Connection con, Statement st, ResultSet rs) {
		try {
			if(rs != null)
				rs.close();
			if(st != null)
				st.close();
			if(con != null)
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}

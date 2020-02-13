package jdbcPjt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class DBUtil {
	
	/* 데이터베이스의 정보 저장되어 있는 Properties 파일  사용(웹에선 경로가 순수자바와 달라서 따로 설정하여 써야하기 때문에 불편함) */	
//	private static Properties dbInfo = new Properties();
//	
//	public static Properties getProp() {
//		return dbInfo;
//	}
	
	private static DataSource dataSource;
	
	/* 로드 */
	static { //메인 함수보다 먼저 실행됨
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
	
	/* 연결 */
	public static Connection getConnection() throws SQLException{
		
		
		return dataSource.getConnection();
//		return DriverManager.getConnection(dbInfo.getProperty("url"), 
//				dbInfo.getProperty("user"), 
//				dbInfo.getProperty("password"));
	}
	
	/* 닫기 */
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

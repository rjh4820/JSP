package jdbcPjt;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newBook")
public class NewBook extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String bookName = request.getParameter("book_name");
		String bookLoc = request.getParameter("book_loc");
		
		/* Statement 사용 */
//		Connection con = null;
//		Statement st = null;
//		try {
//			con = DBUtil.getConnection();
//			st = con.createStatement();
//			String sqlSt = "INSERT INTO book VALUES (BOOK_SEQ.NEXTVAL, '"+ bookName + "', '" + bookLoc + "')";
//			
//			int rsltSt = st.executeUpdate(sqlSt);
//			
//			if(rsltSt == 1)
//				out.print("INSERT Success.");
//			else 
//				out.print("INSERT Fail.");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.dbClose(con, st);
//		}
		
		/* PreparedStatement 사용 */
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		
		try {
			con = DBUtil.getConnection();
			String sqlPs = "INSERT INTO book VALUES (BOOK_SEQ.NEXTVAL, ?, ?)";
			ps = con.prepareStatement(sqlPs);
			ps.setString(1, bookName);
			ps.setString(2, bookLoc);
			int rsltPs = ps.executeUpdate();
			
			if(rsltPs == 1)
				out.print("INSERT Success.");
			else 
				out.print("INSERT Fail.");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(con, st);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

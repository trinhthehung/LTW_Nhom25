package wp.Ryo.model;

import wp.Ryo.bean.*;
import wp.Ryo.model.*;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUser {
	public DBUser() {
		
	}
	
	// Hàm gọi function để kiểm tra tài khoản có tồn tại hay không 
	public Boolean checkUser(User user) throws SQLException {
		Connection conn = ConnectDatabase.getConnection();
		String cmd = "select fCheckUser('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getRole()+"') as kt";
		ResultSet rs = ConnectDatabase.ExecuteQueryResultSet(conn, cmd);
		
		try {
			int kt = 0;
			while(rs.next()) {
				kt = rs.getInt("kt");
			}
			
			if (kt==1) return true;
		}
		
		catch (Exception ex) {
			Logger.getLogger(DBUser.class.getName()).log(Level.SEVERE, null, ex);
		}
		conn.close();
		return false;
	}
	
	// Hàm gọi store procedure để xóa tài khoản
	public Boolean deleteUser(User user) throws SQLException {
		Connection conn = ConnectDatabase.getConnection();
		try {
			String call = "{call spDeleteUser(?)}";
			CallableStatement stmt = conn.prepareCall(call);
			stmt.setString(1, user.getUsername());
			return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
		} catch (Exception e) {
			return false;
		}finally {
			conn.close();
		}
	}
	
	// Hàm gọi store procedure để tạo tài khoản
	public Boolean signupUser(User user, UserInfo userinfo) throws SQLException {			
		Connection conn = ConnectDatabase.getConnection();
		try {
			String call = "{call spCreateUser(?,?,?,?,?)}";
			CallableStatement stmt = conn.prepareCall(call);
			stmt.setString(1,  user.getUsername());
			stmt.setString(2,  user.getPassword());
			stmt.setString(3,  userinfo.getFullname());
			stmt.setString(4,  userinfo.getDepartmentId());
			stmt.setInt(5,  user.getRole());
			return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
			}
		catch (Exception e) {
			return false;
		}
		finally {
			conn.close();
			
		}
				
	}
	
}

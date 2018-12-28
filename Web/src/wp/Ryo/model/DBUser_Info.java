package wp.Ryo.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import wp.Ryo.model.ConnectDatabase;
import wp.Ryo.bean.User;
import wp.Ryo.bean.UserInfo;

public class DBUser_Info {

	public DBUser_Info() {
	
	}
	
	// Hàm gọi store procedure để update tài khoản theo quyền admin
		public Boolean updateUser(User user, UserInfo user_info) throws SQLException {
			Connection conn = ConnectDatabase.getConnection();
			try {
				String call = "{call spUpdateUser(?,?,?,?)}";
				CallableStatement stmt = conn.prepareCall(call);
				stmt.setString(1, user.getUsername());
				stmt.setString(2, user.getPassword());
				stmt.setInt(3, user.getRole());
				stmt.setString(4, user_info.getFullname());
				
				return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
			} catch (Exception e) {
				return false;
			}finally {
				conn.close();
			}
		}
		
		
		// Hàm gọi store procedure để lấy họ tên người đăng nhập
		public String getFullname(User User) throws SQLException {
			Connection conn = ConnectDatabase.getConnection();
			String cmd = "select fGetFullname('"+User.getUsername()+"') as kt";
			
			ResultSet rs = ConnectDatabase.ExecuteQueryResultSet(conn, cmd);
			try {
				String fullname = null;
				while(rs.next()) {
					fullname = rs.getString("kt");
				}
				
				
				
				return fullname;
			}
			catch (Exception e) {
				return null;
			}finally {
				conn.close();
			}
		}
		
		
			// Hàm gọi store procedure để update thông tin cá nhân
				public Boolean updateInfo(User user, UserInfo user_info) throws SQLException {
					Connection conn = ConnectDatabase.getConnection();
					try {
						String call = "{call spUpdateInfo(?,?,?,?,?,?,?,?)}";
						CallableStatement stmt = conn.prepareCall(call);
						stmt.setString(1, user.getUsername());
						stmt.setString(2, user_info.getFullname());
						stmt.setString(3, user.getPassword());
						stmt.setString(4, user_info.getBirthday());
						stmt.setString(5, user_info.getSex());
						stmt.setString(6, user_info.getHometown());
						stmt.setString(7, user_info.getPhone());
						stmt.setString(8, user_info.getEmail());
						
						
						return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
					} catch (Exception e) {
						return false;
					}finally {
						conn.close();
					}
				}
		
	
}
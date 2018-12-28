package wp.Ryo.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import wp.Ryo.model.ConnectDatabase;
import wp.Ryo.bean.Question;
import wp.Ryo.bean.QuestionInfo;
import wp.Ryo.bean.User;
import wp.Ryo.bean.UserInfo;
import wp.Ryo.bean.Exam;

public class DBExam {
	public DBExam() {
		
	}
	
			// Hàm gọi store procedure để tạo đề thi
			public Boolean createExam(Exam ex) throws SQLException {			
				Connection conn = ConnectDatabase.getConnection();
				try {
					String call = "{call spCreateExam(?,?,?,?,?,?)}";
					CallableStatement stmt = conn.prepareCall(call);
					stmt.setString(1,  ex.getExamId());
					stmt.setString(2,  ex.getExamName());
					stmt.setString(3,  ex.getSubject());
					stmt.setInt(4,  ex.getNum());
					stmt.setString(5,  ex.getTestDay());
					stmt.setInt(6,  ex.getExamTime());
					
					
					System.out.println(ex.getExamId());
					System.out.println(ex.getExamName());
					System.out.println(ex.getSubject());
					System.out.println(ex.getNum());
					System.out.println(ex.getTestDay());
					System.out.println(ex.getExamTime());
					
					
					return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
				}
				catch (Exception e) {
					return false;
				}
				finally {
					conn.close();	
				}
						
			}
		
			
			// Hàm gọi function để lấy Số câu hỏi
			public static int getNumQues(Exam ex) throws SQLException {
				Connection conn = ConnectDatabase.getConnection();
				String cmd = "select fCheckNum('"+ex.getExamId()+"') as kt";
				
				ResultSet rs = ConnectDatabase.ExecuteQueryResultSet(conn, cmd);
				try {
					int num = -1;
					while(rs.next()) {
						num = Integer.parseInt(rs.getString("kt"));
					}
					System.out.println(num);
					return num;
				}
				catch (Exception e) {
					return -1;
				}finally {
					conn.close();
				}
			}
			
			
			// Hàm gọi store procedure để thêm câu hỏi vào đề thi
			public Boolean addQuesToExam(Exam ex, QuestionInfo qsinfo) throws SQLException {			
				Connection conn = ConnectDatabase.getConnection();
				try {
					String call = "{call spAddQues(?,?,?)}";
					CallableStatement stmt = conn.prepareCall(call);
					stmt.setString(1,  ex.getExamId());
					stmt.setString(2,  ex.getSubject());
					stmt.setString(3,  qsinfo.getLevel());
							
					return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
				}
				catch (Exception e) {
					return false;
				}
				finally {
					conn.close();	
				}
									
			}
			
			// Hàm gọi store procedure để thêm khoa thi
			public Boolean addDepartment(Exam ex, UserInfo us) throws SQLException {			
				Connection conn = ConnectDatabase.getConnection();
				try {
					String call = "{call spAddDepartment(?,?)}";
					CallableStatement stmt = conn.prepareCall(call);
					stmt.setString(1,  ex.getExamId());
					stmt.setString(2,  us.getDepartmentId());
					
					System.out.println(ex.getExamId());
										
					return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
					}
				catch (Exception e) {
					return false;
				}
				finally {
					conn.close();	
				}
												
			}
			
			
			// Hàm gọi store procedure để xóa đề thi
			public Boolean deleteExam(Exam ex) throws SQLException {
				Connection conn = ConnectDatabase.getConnection();
				try {
					String call = "{call spDeleteExam(?)}";
					CallableStatement stmt = conn.prepareCall(call);
					stmt.setString(1, ex.getExamId());
					return ConnectDatabase.MyExcuteUpdateNonQuery(conn, stmt);
				} catch (Exception e) {
					return false;
				}finally {
					conn.close();
				}
			}
			
}

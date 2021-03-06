package wp.Ryo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wp.Ryo.bean.User;
import wp.Ryo.bean.UserInfo;
import wp.Ryo.model.DBUser_Info;

@WebServlet("/capnhapUser")
public class updateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public updateUser() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//nhận MSND và chuyển nó đến trang UpdatePage.jsp
		String username = (String) request.getParameter("MSND");
		request.setAttribute("MSND", username);
		request.getRequestDispatcher("/WEB-INF/UpdateUser.jsp").forward(request, response);		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// nhận chuẩn bộ mã hóa ký tự UTF-8
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
	
		  // nhận giá trị từ request
		String username = (String) request.getParameter("u_username");
		String password = (String) request.getParameter("u_pw");
		String role = (String) request.getParameter("u_role");
		String fullname = (String) request.getParameter("u_fullname");
		
		
		// đưa dữ liệu vào gói model
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(Integer.parseInt(role));
		
		UserInfo userinfo = new UserInfo();
		userinfo.setFullname(fullname);
		
		
		// gọi hàm cập nhật user từ lớp DBUser_Info của gói model
		DBUser_Info db = new DBUser_Info();
		
		try {
			if (db.updateUser(user, userinfo)) {
				request.setAttribute("thongbao", 20);
				request.getRequestDispatcher("/WEB-INF/AdminPage.jsp").forward(request, response);
			}
			else
			{
				//thông báo thất bại
				request.setAttribute("thongbao", 21);
				request.getRequestDispatcher("/WEB-INF/UpdateUser.jsp?MSND="+username).forward(request, response);
			}
		}
		catch (Exception e) {
			//thông báo thất bại
			request.setAttribute("thongbao", 22);
			request.getRequestDispatcher("/WEB-INF/UpdateUser.jsp?MSND="+username).forward(request, response);
		}
	}
}

		
		
		
		
		
		
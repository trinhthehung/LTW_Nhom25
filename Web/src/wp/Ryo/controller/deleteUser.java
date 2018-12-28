package wp.Ryo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wp.Ryo.bean.User;
import wp.Ryo.model.DBUser;

@WebServlet("/xoaUser")
public class deleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public deleteUser() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// nhận username từ request
		String username = (String) request.getParameter("MSND");
		//MSND la gia tri ben form xoa user cua trang admin
		
		// đưa dữ liêụ vào model
		DBUser db = new DBUser();
		User user= new User();
		user.setUsername(username);
		try {
			// gọi hàm xóa user từ gói model
			if (db.deleteUser(user)) {
				request.setAttribute("thongbao", 0);
				request.getRequestDispatcher("/WEB-INF/AdminPage.jsp").forward(request, response);
			}
			else {
				//thông báo thất bại
				request.setAttribute("thongbao", 1);
				request.getRequestDispatcher("/WEB-INF/AdminPage.jsp").forward(request, response);
			}
		}
		
		catch (Exception e) {
			//thông báo thất bại
			request.setAttribute("thongbao", 2);
			request.getRequestDispatcher("/WEB-INF/AdminPage.jsp").forward(request, response);
		}	
		
	}

}

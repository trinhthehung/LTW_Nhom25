<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.io.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html lang=vi>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=uft-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/Trang_chu.css" type="text/css" rel="stylesheet">
    <link href="css/Trang_Admin.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="shortcut icon" href="images/logo.png"/>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/search_table.js"></script>
    <script src="js/disable_text.js"></script>
    
    <link href="css/jquery.dataTables.min.css" type="text/css" rel="stylesheet">
    <script src="js/jquery.dataTables.min.js"></script>
    <title>Trang Admin</title>
</head>

<body data-spy="scroll" data-target=".navbar" data-offset="50">
    <header class="header">
        <img src="images/SPKT.jpg" alt="Trường ĐH SPKT">
    </header>

    <nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="trangchu">Trang chủ</a>
            </div>
            <div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><a href="thongtincanhan">Trang cá nhân</a></li>
                    </ul>
                    
                   	<%@ page import = "java.io.*,java.util.*" %>
                   	<%
                   		String username = (String) session.getAttribute("username");
                   		String role = (String) session.getAttribute("role");
                   		int rl = Integer.parseInt(role);
                   		if(username != null && rl == 1) {
                   		}
                   		else {
                   			request.getRequestDispatcher("/WEB-INF/HomePage.jsp").forward(request, response);
                   		}
                   	%>
                    
                    
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="trangAdmin"><span class="glyphicon glyphicon-user"></span> Admin. ${name}</a></li>
                        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> Đăng xuất</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </nav>

    <div class="my-container">
        <div class="menu">
            <table class="table">
                <tbody>
                    <tr>
                        <td>
                            <a class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" style="background: #c9fafc;">
                                <span class="glyphicon glyphicon-plus-sign"></span> Thêm thành viên
                            </a>
                        </td>
                    </tr>
                    <tr>
                        <td><a href="#" title=""><span class="  glyphicon glyphicon-open-file"></span> Thêm thành viên (Excel)</a></td>
                    </tr>
                </tbody>
            </table> 
        </div>
        <div class="list">
            <div class="form-group">
                <label style="color: red;font-weight: bold;"><span class="glyphicon glyphicon-search"></span> Tìm nhanh</label>
                <input type="text" id="searchTable" class="form-control" placeholder="Tìm..." style="width: 95%;height:100% ;background: #fff">
            </div>
            <script>
	            $(document).ready(function() {
	                $('#pt').DataTable();
	            } );
            </script>
            <table class="table" style="width: 100%" id="pt">
                <thead>
                    <tr>
                        <th>MSND</th>
                        <th>Mã Khoa</th>
                        <th>Họ tên</th>
                        <th>Mã quyền</th>
                        <th>Sđt</th>
                        <th>Xem</th>
                        <th>Xóa</th>
                        <th>Sửa</th>
                    </tr>
                </thead>
                
                <!-- Thông báo của xóa -->
                <c:if test="${thongbao eq 0}">
                	<script type="text/javascript">
			  			alert("Xóa thành công!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 1}">
                	<script type="text/javascript">
			  			alert("Xóa thất bại!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 3}">
                	<script type="text/javascript">
			  			alert("Không thể xóa chính mình!");
					</script>
				</c:if>
				
				<!-- Thông báo của cập nhật -->
				<c:if test="${thongbao eq 20}">
                	<script type="text/javascript">
			  			alert("Cập nhật thành công!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 21}">
                	<script type="text/javascript">
			  			alert("Cập nhật thất bại!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 22}">
                	<script type="text/javascript">
			  			alert("Lỗi ùi!!!");
					</script>
				</c:if>
				
				
                <!-- connect databse -->
			<sql:setDataSource var="data"
				driver="com.mysql.jdbc.Driver"
				url="jdbc:mysql://localhost/web-tracnghiem" user = "root"  password = "chuan"/>
			
			<sql:query dataSource="${data}" var="result">
         		select * from nguoidung, userrole where nguoidung.MSND = userrole.MSND;
         	</sql:query>
                
                <tbody id="myTable">
                	<c:forEach var="row" items="${result.rows}">
                		<c:if test="${row.MSND !='noname'}">
                			<tr>
                				<td>${row.MSND}</td>
                				<td>${row.MaKhoa}</td>
                				<td>${row.HoTen}</td>
                				<td>${row.MaQuyen}</td>
                				<td>${row.Sdt}</td>
                				<td><a href="capnhapUser?MSND=${row.MSND}"><img src="icons/edit.png"></a></td>
                				<td>
                					<form action="xoaUser?MSND=${row.MSND}" id="button" method="post"><button type="submit"><img src="icons/del.png"></button></form>
                				</td>
                				<td><a href="capnhapUser?MSND=${row.MSND}"><img src="icons/about.png"></a></td>
                			</tr>
                		</c:if>
                	</c:forEach>
                </tbody>
             </table>
          </div>
      </div>

    <!-- Modal Add Members-->
    <div class="modal fade" id="myModal" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3 class="modal-title">Thêm thành viên</h3>
                </div>
                
                <form role="form" action="taomoithanhvien" method="post">
                    <div class="modal-body">
                    
                    <!--Bắt lỗi khi tạo mới-->
			  	<c:if test="${thongbao eq 10 }">
			  		<script type="text/javascript">
			  			alert("Tên đăng nhập đã tồn tại. Vui lòng nhập lại!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 11 }">
					<script type="text/javascript">
			  			alert("Thêm thành viên thành công!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 12 }">
					<script type="text/javascript">
			  			alert("Tên đăng nhập hoặc mật khẩu chưa đúng yêu cầu!");
					</script>
				</c:if>
				<c:if test="${thongbao eq 13 }">
					<script type="text/javascript">
			  			alert("Virus rồi. Tắt máy bạn eiiiii");
					</script>
				</c:if>
                    
                    	
                    	<sql:setDataSource var="data"
							driver="com.mysql.jdbc.Driver"
							url="jdbc:mysql://localhost/web-tracnghiem" user = "root"  password = "chuan"/>
							
						<sql:query dataSource="${data}" var="result">
	         				select * from khoa
	         			</sql:query>
                    	
                        <div class="form-group">
                            <label for="usrname"><span class="glyphicon glyphicon-user"></span> Tên đăng nhập</label>
                            <input type="text" name = "c_username" class="form-control" id="usrname" placeholder="Nhập tên đăng nhập" required>
                        </div>
                        <div class="form-group">
                            <label for="psw"><span class="glyphicon glyphicon-eye-close"></span> Mật khẩu</label>
                            <input type="text" name="c_pw" class="form-control" id="psw" placeholder="Nhập mật khẩu" required maxlength="20">
                        </div>
                        <div class="form-group">
                            <label for="psw"><span class="glyphicon glyphicon-eye-close"></span> Họ tên</label>
                            <input type="text" name="c_fullname" class="form-control" id="psw" placeholder="Nhập mật khẩu" required maxlength="20">
                        </div>
                        <div class="form-group">
                            <label for="psw"><span class="glyphicon glyphicon-eye-close"></span> Mã Khoa</label>
                            <select name="c_department">
                            	<c:forEach var="row" items="${result.rows}">
                				<c:if test="${row.MaKhoa !='noname'}">
                            		<option>${row.MaKhoa}</option>
                            	</c:if>
                            	</c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="psw"><span class="glyphicon glyphicon-eye-close"></span> Mã quyền truy cập</label>
                            <input type="text" name="c_role" class="form-control" id="psw" placeholder="Nhập mật khẩu" required maxlength="20">
                        </div>
                        
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-info btn-default pull-left">
                            <span class="glyphicon glyphicon-plus-sign"></span> Thêm mới
                        </button>
                        <button type="submit" class="btn btn-warning btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Thoát</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <footer>
        <div class="copyright">© Copyright 2017 by
            <a href="#">Example</a>. Lượng-Hùng-Đạt
            <div class="icon">
                <img src="icons/icon6.png" alt="Some alt text" width="25">
                <img src="icons/icon7.png" alt="Some alt text" width="25">
                <img src="icons/icon8.png" alt="Some alt text" width="25">
                <img src="icons/icon9.png" alt="Some alt text" width="25">
                <img src="icons/icon10.png" alt="Some alt text" width="25">
            </div>
        </div>
    </footer>




</body>
</html>
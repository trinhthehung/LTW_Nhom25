/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-12-31 05:20:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class AdminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/E:/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Web/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098685890000L));
    _jspx_dependants.put("jar:file:/E:/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Web/WEB-INF/lib/standard.jar!/META-INF/sql.tld", Long.valueOf(1098685890000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1513609077695L));
    _jspx_dependants.put("jar:file:/E:/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Web/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098685890000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=vi>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=uft-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"css/Trang_chu.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/Trang_Admin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/logo.png\"/>\r\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/search_table.js\"></script>\r\n");
      out.write("    <script src=\"js/disable_text.js\"></script>\r\n");
      out.write("    <title>Trang Admin</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <img src=\"images/SPKT.jpg\" alt=\"Trường ĐH SPKT\">\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-inverse\" data-spy=\"affix\" data-offset-top=\"197\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"trangchu\">Trang chủ</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"#section1\">Trang quản trị</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Trang cá nhân</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Lịch làm việc</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("         \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Admin. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("                        <li><a href=\"logout\"><span class=\"glyphicon glyphicon-log-out\"></span> Đăng xuất</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"my-container\">\r\n");
      out.write("        <div class=\"info-avatar\">\r\n");
      out.write("            <h2>Thông tin cá nhân</h2>\r\n");
      out.write("            <div class=\"avatar inline-block\" style=\"float: left\">\r\n");
      out.write("                <img src=\"../Picture/chuan.jpg\" style=\"width: 100%; height: 100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"personal-info inline-block\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"><span class=\"glyphicon glyphicon-user\"></span> Tên đăng nhập:</label> 15110168\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Họ tên:</label> Nguyễn Tô Doanh Chuẩn\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Khoa:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Mã lớp:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Ngày sinh:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Giới tính:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Quê quán:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Số điện thoại:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label style=\"color: blue\"></span> Email:</label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\" style=\"margin-left: 45%; margin-top: 3%\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-success btn-default pull-left\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"margin-right:3%\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-refresh\"></span> Cập nhật\r\n");
      out.write("                </button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-info btn-default pull-left\" style=\"margin-right:3%\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-refresh\"></span> Đổi avatar\r\n");
      out.write("                </button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-info btn-default pull-left\" style=\"margin-right:3%\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-refresh\"></span> Đổi mật khẩu\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal Edit Info-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal content-->\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                    <h3 class=\"modal-title\">Cập nhật thông tin</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form role=\"form\" action=\"Welcome\" method=\"post\">\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"usrname\"> Họ tên</label>\r\n");
      out.write("                            <input type=\"text\" name = \"c_username\" class=\"form-control\" id=\"usrname\" placeholder=\"Nhập tên đăng nhập\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label> Ngày sinh</label>\r\n");
      out.write("                            <input type=\"text\" name=\"c_pw\" class=\"form-control\" id=\"psw\" placeholder=\"Nhập mật khẩu\" required maxlength=\"20\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"psw\">Giới tính</label>\r\n");
      out.write("                            <input type=\"password\" name=\"fullname\" class=\"form-control\" id=\"psw\" placeholder=\"Nhập họ tên\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"psw\">Quê quán</label>\r\n");
      out.write("                            <input type=\"password\" name=\"pwd\" class=\"form-control\" id=\"psw\" placeholder=\"Nhập mã\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"psw\">Số điện thoại</label>\r\n");
      out.write("                            <input type=\"password\" name=\"pwd\" class=\"form-control\" id=\"psw\" placeholder=\"Nhập mã\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"psw\">Email</label>\r\n");
      out.write("                            <input type=\"password\" name=\"pwd\" class=\"form-control\" id=\"psw\" placeholder=\"Nhập mã\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info btn-default pull-left\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-plus-sign\"></span> Thêm mới\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-warning btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Thoát</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"copyright\">© Copyright 2017 by\r\n");
      out.write("            <a href=\"#\">Example</a>. Chiến-Kha-Chuấn\r\n");
      out.write("            <div class=\"icon\">\r\n");
      out.write("                <img src=\"icons/icon6.png\" alt=\"Some alt text\" width=\"25\">\r\n");
      out.write("                <img src=\"icons/icon7.png\" alt=\"Some alt text\" width=\"25\">\r\n");
      out.write("                <img src=\"icons/icon8.png\" alt=\"Some alt text\" width=\"25\">\r\n");
      out.write("                <img src=\"icons/icon9.png\" alt=\"Some alt text\" width=\"25\">\r\n");
      out.write("                <img src=\"icons/icon10.png\" alt=\"Some alt text\" width=\"25\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

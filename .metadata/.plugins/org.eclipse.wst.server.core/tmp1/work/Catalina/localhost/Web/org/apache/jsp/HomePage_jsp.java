/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-12-26 18:02:50 UTC
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

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!-- Xóa bỏ các thuộc tính lưu trong sesion -->\r\n");
 session.invalidate();
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=vi>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=uft-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"css/Trang_chu.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/logo.png\"/>\r\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <title>Trang chủ</title>\r\n");
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
      out.write("                <a class=\"navbar-brand\" href=\"#\">Trang chủ</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"#section1\">Thông báo</a></li>\r\n");
      out.write("                        <li><a href=\"#section2\">Kỳ thi</a></li>\r\n");
      out.write("                        <li><a href=\"#section3\">Môn học</a></li>\r\n");
      out.write("                        <li><a href=\"#section4\">Nhà phát triển</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <form class=\"navbar-form navbar-left\" action=\"#\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn my-btn\" data-toggle=\"modal\" data-target=\"#myModal\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-search\"></span></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"my-container\">\r\n");
      out.write("        <marquee onmouseover=\"this.stop()\" onmouseout=\"this.start()\"  id=\"logo\">Trắc nghiệm online - Trường đại học Sư phạm kỹ thuật TP.Hồ Chí Minh</marquee>\r\n");
      out.write("    \r\n");
      out.write("        <!--Section 1-->\r\n");
      out.write("        <div id=\"section1\" class=\"container-fluid\">\r\n");
      out.write("            <h1 class=\"tieude\"><span class=\"glyphicon glyphicon-th-list\"></span> Thông báo</h1>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("                <div class=\"list-group\">\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Tin tức</a>\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Giới thiệu chung</a>\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Thông báo PĐT</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" style=\"width: 650px; margin: 0 auto;\">\r\n");
      out.write("                    <ol class=\"carousel-indicators\">\r\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                    <div class=\"carousel-inner\">\r\n");
      out.write("                        <div class=\"item active\">\r\n");
      out.write("                            <img src=\"images/Chemistry.jpg\" alt=\"Anh văn đầu vào\" style=\"width:100%;height:400px\">\r\n");
      out.write("                            <div class= \"carousel-caption\">\r\n");
      out.write("                                <h3>Anh văn đầu vào</h3>\r\n");
      out.write("                                <p>Danh sách phòng thi anh văn đầu vào</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <img src=\"images/math.jpg\" alt=\"Thông Báo Cuộc Thi Trắc Nghiệm Toán A1\" style=\"width:100%;height:400px\">\r\n");
      out.write("                            <div class= \"carousel-caption\">\r\n");
      out.write("                                <h3>Toán A1</h3>\r\n");
      out.write("                                <p>Thông Báo Cuộc Thi Trắc Nghiệm Toán A1</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <img src=\"images/Physics.jpg\" alt=\"Danh Sách Điểm Môn Lập Trình Web\" style=\"width:100%;height:400px\">\r\n");
      out.write("                            <div class= \"carousel-caption\">\r\n");
      out.write("                                <h3>Lập Trình Web</h3>\r\n");
      out.write("                                <p>Danh Sách Điểm Môn Lập Trình Web</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Next</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--Section 2-->\r\n");
      out.write("        <div id=\"section2\" class=\"container-fluid\">\r\n");
      out.write("            <h1 class=\"tieude\"><span class=\"glyphicon glyphicon-th-list\"></span> Kỳ thi</h1>\r\n");
      out.write("            <div class='col-sm-8'>\r\n");
      out.write("                <div class=\"carousel slide media-carousel\" id=\"media\">\r\n");
      out.write("                    <div class=\"carousel-inner\">\r\n");
      out.write("                        <div class=\"item  active\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/AVR.png\" style=\"width: 100%\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/AVV.jpg\" style=\"width: 100%\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/HDH.jpg\" style=\"width: 100%\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"##\"><img alt=\"\" src=\"images/kien-truc-may-tinh.png\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/mang-may-tinh.gif\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/trung-tam-tin-hoc.jpg\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/vat-ly.gif\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/web.png\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-4\">\r\n");
      out.write("                                    <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"images/volkan-olmez-73767.jpg\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a data-slide=\"prev\" href=\"#media\" class=\"left carousel-control\">‹</a>\r\n");
      out.write("                        <a data-slide=\"next\" href=\"#media\" class=\"right carousel-control\">›</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--Section 3-->\r\n");
      out.write("        <div id=\"section3\" class=\"container-fluid\">\r\n");
      out.write("            <h1 class=\"tieude\"><span class=\"glyphicon glyphicon-education\"></span> Môn Học</h1>\r\n");
      out.write("            <section class=\"dsmonhoc\">\r\n");
      out.write("                <div id=\"mon1\" class=\"inline-block\">\r\n");
      out.write("                    <a href=\"\"><p>Anh văn 1</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"mon2\" class=\"inline-block\">\r\n");
      out.write("                    <a href=\"\"><p>Vật lý 1</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"mon3\" class=\"inline-block\">\r\n");
      out.write("                    <a href=\"\"><p>Mạng máy tính</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"mon4\" class=\"inline-block\">\r\n");
      out.write("                    <a href=\"\"><p>Toán A1</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"mon5\" class=\"inline-block\">\r\n");
      out.write("                    <a href=\"\"><p>Lập trình web</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"mon6\" class=\"inline-block\">\r\n");
      out.write("                    <a href=\"\"><p>Hệ điều hành</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"\"><p style=\"float:right\">*Xem tất cả môn học*</p></a>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"section4\" class=\"container-fluid\">\r\n");
      out.write("            <h1 class=\"tieude\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-briefcase\"></span> Nhà phát triển\r\n");
      out.write("                <a class=\"arrow\" href=\"#\" id=\"left-arrow\">\r\n");
      out.write("                    <img src=\"icons/previous.png\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"arrow\" href=\"#\" id=\"right-arrow\">\r\n");
      out.write("                    <img src=\"icons/next.png\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <section class=\"editer\">\r\n");
      out.write("                <div class=\"slider\" id=\"slider\">\r\n");
      out.write("                    <div class=\"slide\" id=\"slide-left\">\r\n");
      out.write("                        <div class=\"slide-holder\">\r\n");
      out.write("                            <div class=\"slide-bg bg-previous\"></div>\r\n");
      out.write("                            <div class=\"slide-bg bg-current\"></div>\r\n");
      out.write("                            <div class=\"slide-bg bg-next\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"slide\" id=\"slide-center\">\r\n");
      out.write("                        <div class=\"slide-holder\">\r\n");
      out.write("                            <div class=\"slide-bg bg-previous\"></div>\r\n");
      out.write("                            <div class=\"slide-bg bg-current\"></div>\r\n");
      out.write("                            <div class=\"slide-bg bg-next\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"slide\" id=\"slide-right\">\r\n");
      out.write("                        <div class=\"slide-holder\">\r\n");
      out.write("                            <div class=\"slide-bg bg-previous\"></div>\r\n");
      out.write("                            <div class=\"slide-bg bg-current\"></div>\r\n");
      out.write("                            <div class=\"slide-bg bg-next\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script src='js/jquery-3.2.1.min.js'></script>\r\n");
      out.write("                <script src='js/velocity.min.js'></script>\r\n");
      out.write("                <script src=\"js/index.js\"></script>\r\n");
      out.write("                <a href=\"\"><p style=\"float:right\">*Xem chi tiết*</p></a>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal content-->\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                    <h3 class=\"modal-title\">UTE Quiz</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form role=\"form\" action=\"trangchu\" method=\"post\">\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                    \r\n");
      out.write("                    \t<!--Bắt lỗi đăng nhập-->\r\n");
      out.write("                    \t<div>\r\n");
      out.write("\t\t\t  \t\t\t\t<p id=\"announce\"></p>\t\t  \t\r\n");
      out.write("\t\t\t  \t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                    \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Tên đăng nhập</label>\r\n");
      out.write("                            <input type=\"text\" name = \"username\" class=\"form-control\" id=\"usrname\" placeholder=\"Nhập tên đăng nhập\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-close\"></span> Mật khẩu</label>\r\n");
      out.write("                            <input type=\"password\" name=\"password\" class=\"form-control\" id=\"psw\" placeholder=\"Nhập mật khẩu\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group checkbox\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rolename\" value=\"4\"> Sinh viên\r\n");
      out.write("                            <input type=\"radio\" name=\"rolename\" value=\"3\" checked> Quản trị kỳ thi\r\n");
      out.write("                            <input type=\"radio\" name=\"rolename\" value=\"2\"> Quản trị câu hỏi\r\n");
      out.write("                            <input type=\"radio\" name=\"rolename\" value=\"1\"> Admin\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"submit\" onsubmit=\"return validateForm()\" class=\"btn btn-info btn-default pull-left\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-off\"></span> Đăng nhập\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-warning btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Thoát</button>\r\n");
      out.write("                        <p>Quên <a href=\"#\">mật khẩu?</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /HomePage.jsp(257,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${thongbao eq 2 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t  \t\t\t\t\t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t  \t\t\t\t\t\talert(\"Thông tin vừa điền không đúng!\\nVui lòng đăng nhập lại.\");\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /HomePage.jsp(262,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${thongbao eq 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
          out.write("\t\t\t  \t\t\t\t\t\talert(\"Lỗi đăng nhập!\\nVui lòng đăng nhập lại.\");\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}

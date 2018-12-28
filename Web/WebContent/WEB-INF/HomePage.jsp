<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.io.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!-- Xóa bỏ các thuộc tính lưu trong sesion -->
<% session.invalidate();%>

<!DOCTYPE html>
<html lang=vi>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=uft-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/Trang_chu.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="shortcut icon" href="images/logo.png"/>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <title>Trang chủ</title>
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
                <a class="navbar-brand" href="#">Trang chủ</a>
            </div>
            <div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><a href="#section1">Thông báo</a></li>
                        <li><a href="#section2">Kỳ thi</a></li>
                        <li><a href="#section3">Môn học</a></li>
                        <li><a href="#section4">Nhà phát triển</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <form class="navbar-form navbar-left" action="#">
                            <button type="button" class="btn my-btn" data-toggle="modal" data-target="#myModal">
                                <span class="glyphicon glyphicon-log-in"></span> Đăng nhập
                            </button>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Search">
                            </div>
                            <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                        </form>
                    </ul>
                </div>
            </div>
        </div>
    </nav>

    <div class="my-container">
        <marquee onmouseover="this.stop()" onmouseout="this.start()"  id="logo">Trắc nghiệm online - Trường đại học Sư phạm kỹ thuật TP.Hồ Chí Minh</marquee>
    
        <!--Section 1-->
        <div id="section1" class="container-fluid">
            <h1 class="tieude"><span class="glyphicon glyphicon-th-list"></span> Thông báo</h1>
            <div class="col-sm-3">
                <div class="list-group">
                    <a href="#" class="list-group-item">Tin tức</a>
                    <a href="#" class="list-group-item">Giới thiệu chung</a>
                    <a href="#" class="list-group-item">Thông báo PĐT</a>
                </div>
            </div>
            <div class="col-sm-6">
                <div id="myCarousel" class="carousel slide" data-ride="carousel" style="width: 650px; margin: 0 auto;">
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active">
                            <img src="images/Chemistry.jpg" alt="Anh văn đầu vào" style="width:100%;height:400px">
                            <div class= "carousel-caption">
                                <h3>Anh văn đầu vào</h3>
                                <p>Danh sách phòng thi anh văn đầu vào</p>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/math.jpg" alt="Thông Báo Cuộc Thi Trắc Nghiệm Toán A1" style="width:100%;height:400px">
                            <div class= "carousel-caption">
                                <h3>Toán A1</h3>
                                <p>Thông Báo Cuộc Thi Trắc Nghiệm Toán A1</p>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/Physics.jpg" alt="Danh Sách Điểm Môn Lập Trình Web" style="width:100%;height:400px">
                            <div class= "carousel-caption">
                                <h3>Lập Trình Web</h3>
                                <p>Danh Sách Điểm Môn Lập Trình Web</p>
                            </div>
                        </div>
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <!--Section 2-->
        <div id="section2" class="container-fluid">
            <h1 class="tieude"><span class="glyphicon glyphicon-th-list"></span> Kỳ thi</h1>
            <div class='col-sm-8'>
                <div class="carousel slide media-carousel" id="media">
                    <div class="carousel-inner">
                        <div class="item  active">
                            <div class="row">
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/AVR.png" style="width: 100%"></a>
                                </div>
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/AVV.jpg" style="width: 100%"></a>
                                </div>
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/HDH.jpg" style="width: 100%"></a>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="row">
                                <div class="col-md-4">
                                    <a class="thumbnail" href="##"><img alt="" src="images/kien-truc-may-tinh.png"></a>
                                </div>
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/mang-may-tinh.gif"></a>
                                </div>
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/trung-tam-tin-hoc.jpg"></a>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="row">
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/vat-ly.gif"></a>
                                </div>
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/web.png"></a>
                                </div>
                                <div class="col-md-4">
                                    <a class="thumbnail" href="#"><img alt="" src="images/volkan-olmez-73767.jpg"></a>
                                </div>
                            </div>
                        </div>
                        <a data-slide="prev" href="#media" class="left carousel-control">‹</a>
                        <a data-slide="next" href="#media" class="right carousel-control">›</a>
                    </div>
                </div> 
            </div>
        </div>

        <!--Section 3-->
        <div id="section3" class="container-fluid">
            <h1 class="tieude"><span class="glyphicon glyphicon-education"></span> Môn Học</h1>
            <section class="dsmonhoc">
                <div id="mon1" class="inline-block">
                    <a href=""><p>Anh văn 1</p></a>
                </div>
                <div id="mon2" class="inline-block">
                    <a href=""><p>Vật lý 1</p></a>
                </div>
                <div id="mon3" class="inline-block">
                    <a href=""><p>Mạng máy tính</p></a>
                </div>
                <div id="mon4" class="inline-block">
                    <a href=""><p>Toán A1</p></a>
                </div>
                <div id="mon5" class="inline-block">
                    <a href=""><p>Lập trình web</p></a>
                </div>
                <div id="mon6" class="inline-block">
                    <a href=""><p>Hệ điều hành</p></a>
                </div>
                <a href=""><p style="float:right">*Xem tất cả môn học*</p></a>
            </section>
        </div>

        <div id="section4" class="container-fluid">
            <h1 class="tieude">
                <span class="glyphicon glyphicon-briefcase"></span> Nhà phát triển
                <a class="arrow" href="#" id="left-arrow">
                    <img src="icons/previous.png">
                </a>
                <a class="arrow" href="#" id="right-arrow">
                    <img src="icons/next.png">
                </a>
            </h1>
            <section class="editer">
                <div class="slider" id="slider">
                    <div class="slide" id="slide-left">
                        <div class="slide-holder">
                            <div class="slide-bg bg-previous"></div>
                            <div class="slide-bg bg-current"></div>
                            <div class="slide-bg bg-next"></div>
                        </div>
                    </div>
                    <div class="slide" id="slide-center">
                        <div class="slide-holder">
                            <div class="slide-bg bg-previous"></div>
                            <div class="slide-bg bg-current"></div>
                            <div class="slide-bg bg-next"></div>
                        </div>
                    </div>
                    <div class="slide" id="slide-right">
                        <div class="slide-holder">
                            <div class="slide-bg bg-previous"></div>
                            <div class="slide-bg bg-current"></div>
                            <div class="slide-bg bg-next"></div>
                        </div>
                    </div>
                </div>
                <script src='js/jquery-3.2.1.min.js'></script>
                <script src='js/velocity.min.js'></script>
                <script src="js/index.js"></script>
                <a href=""><p style="float:right">*Xem chi tiết*</p></a>
            </section>

        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="myModal" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3 class="modal-title">UTE Quiz</h3>
                </div>
                <form role="form" action="trangchu" method="post">
                    <div class="modal-body">
                    
                    	<!--Bắt lỗi đăng nhập-->
                    	<div>
			  				<p id="announce"></p>		  	
			  				<c:if test="${thongbao eq 2 }">
			  					<script type="text/javascript">
			  						alert("Thông tin vừa điền không đúng!\nVui lòng đăng nhập lại.");
								</script>
							</c:if>
							<c:if test="${thongbao eq 1 }">
								<script type="text/javascript">
			  						alert("Lỗi đăng nhập!\nVui lòng đăng nhập lại.");
								</script>
							</c:if>
						</div>
                    
                        <div class="form-group">
                            <label for="usrname"><span class="glyphicon glyphicon-user"></span> Tên đăng nhập</label>
                            <input type="text" name = "username" class="form-control" id="usrname" placeholder="Nhập tên đăng nhập" required>
                        </div>
                        <div class="form-group">
                            <label for="psw"><span class="glyphicon glyphicon-eye-close"></span> Mật khẩu</label>
                            <input type="password" name="password" class="form-control" id="psw" placeholder="Nhập mật khẩu" required>
                        </div>
                        <div class="form-group checkbox">
                            <input type="radio" name="rolename" value="4"> Sinh viên
                            <input type="radio" name="rolename" value="3" checked> Quản trị kỳ thi
                            <input type="radio" name="rolename" value="2"> Quản trị câu hỏi
                            <input type="radio" name="rolename" value="1"> Admin
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" onsubmit="return validateForm()" class="btn btn-info btn-default pull-left">
                            <span class="glyphicon glyphicon-off"></span> Đăng nhập
                        </button>
                        <button type="submit" class="btn btn-warning btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Thoát</button>
                        <p>Quên <a href="#">mật khẩu?</a></p>
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
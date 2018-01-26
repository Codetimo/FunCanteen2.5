<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/icon.png">
<link rel="stylesheet"
	href="//apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="external nofollow">
<link rel="stylesheet" href="css/font-awesome.css"
	rel="external nofollow" type="text/css"></link>
<link rel="stylesheet" href="css/ui.css" rel="external nofollow"
	type="text/css"></link>
<link rel="stylesheet" href="css/form.css" rel="external nofollow"
	type="text/css"></link>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<link rel="stylesheet" href="css/windowmain.css" />
<title>商户主界面</title>
</head>
<body>
	<div class="modal fade" id="mylove">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	</div>

	<div class="modal fade" id="updatelove">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	</div>
	
	<div class="modal fade" id="addProp">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	</div>
	
	<div style="width:900px;margin:0 auto">
	    <div id="biaoti">
			<div id="myCarousel" class="carousel slide" data-ride="carousel" style="width:900px;">
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
			  <div class="item active">
			  	<img src="img/a.jpg" alt="第一张"/>
			  	  <div class="carousel-caption">	<!--描述：添加文本信息-->
			  	  	<h3>拌饭</h3>
			  	  	<p>韩式美味拌饭系列</p>
			  	  </div>
			  </div>
			  <div class="item">
			  	<img src="img/d.jpg" alt="第二张"/>
			  	 <div class="carousel-caption">
			  	  	<h3>甜点</h3>
			  	  	<p>美食甜点系列</p>
			  	  </div>
			  </div>
			  <div class="item">
			  	<img src="img/c.jpg" alt="第三张"/>
			  	 <div class="carousel-caption">
			  	  	<h3>圣诞</h3>
			  	  	<p>圣诞狂欢</p>
			  	  </div>
			  </div>
			</div>
			<a href="#myCarousel" data-slide="prev" class="carousel-control left">&lsaquo;</a>
			<a href="#myCarousel" data-slide="next" class="carousel-control right">&rsaquo;</a>
		   </div>
		  </div>
		  
		  <div id="biaoge">
			<div id="daohang">
				<div id="dianming">
					<p><h1>调整菜品信息</h1></p>
				
				</div>
				<div id="sousuo">				    
					 <a class="btn btn-primary glyphicon glyphicon-edit" href="${pageContext.request.contextPath }/gotoOrder.action">订单处理</a>
					 <a class="btn btn-primary glyphicon glyphicon-plus add" href="${pageContext.request.contextPath }/gotoaddDish.action" data-toggle="modal" data-target="#mylove">添加菜品</a> 
					 <a class="btn btn-danger" href="${pageContext.request.contextPath }/goback.action">注销</a>
				</div>			
			</div>
				
		<table class="table table-striped table-bordered">
			<thead style="color: red; font-size: 20px;">
				<tr>
					<th style="text-align: center;">ID</th>
					<th style="text-align: center;">菜名</th>
					<th style="text-align: center;">价格</th>
					<th style="text-align: center; width: 62px">主图</th>
					<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody style="text-align: center;">
			  <c:forEach items="${dishbywidlist }" var="dish">
				<tr>
					<td>${dish.dishid }</td>
					<td>${dish.dishname }</td>
					<td>${dish.price}</td>
					<td style="width:62px;height:62px ;">
					 <div style="width: 60px;height:60px;">
						<img src="img/${dish.photo} "
							style="width:58px; height:58px;" alt="wutu"> 
					 </div>
					</td>
					<td>					
					  <a class="btn btn-danger glyphicon glyphicon-trash" href="${pageContext.request.contextPath }/delDish.action?did=${dish.dishid }">删除</a>										
					  <a class="btn btn-warning glyphicon glyphicon-edit" href="${pageContext.request.contextPath }/goupDish.action?did=${dish.dishid}" data-toggle="modal" data-target="#updatelove">修改</a>					
					</td>
				</tr>
			  </c:forEach>			
			</tbody>			
		</table>		 
	 </div>
  </div>
	
		<div style="width:900px;margin:0 auto;">
		  <div style="width:300px float: left;">
		      <a class="btn btn-primary glyphicon glyphicon-plus add" data-toggle="collapse" data-target="#div1">添加活动</a>
		       <div class="collapse" id="div1">       <!--collapse隐藏-->
			      <div class="container">
			           <form action="${pageContext.request.contextPath }/addpro.action" method="post">
                            <div>
		                   <tr>
		                      <td style="width:150px">活动名称:</td>
		                      <td><input type="text" name="proname"></td>
		                   </tr>
		                   <tr>
		                       <td>活动内容</td>
		                       <td><input type="text" name="content"></td>
		                   </tr>
			               <tr>                              				
				               <td>活动时间</td>
				               <td><input type="text" name="time"></td>
			               </tr>
			               <tr>
				               <td>活动商家</td>								
				              <td><input type="text" name="windowname"></td>
		                   </tr>
                          </div>                          
                               <input class="btn btn-success" type="submit" value="提交">	                    
	                   </form> 
			      </div>
		       </div>
		 </div>		 
		</div>
</body>
</html>
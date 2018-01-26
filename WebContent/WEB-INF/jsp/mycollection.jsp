<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
<title>我的收藏</title>
<style type="text/css">
     .thumbnail {
         MARGIN: auto;
         WIDTH: 45px;
         }
     .thumbnail img{
         MAX-WIDTH: 100%!important;
         HEIGHT: auto!important;
         width:expression(this.width > 45 ? "45px" : this.width)!important;
         }
     th  
       {  
       text-align:center;  
         } 
</style>
</head>
<body>
<%-- <c:forEach items="${collection }" var="col">
  <h4>${col }</h4>
</c:forEach> --%>
<%-- <table width="100%" border=1>
<thead>
		<tr>
			<th>ID</th>
			<th>菜名</th>
			<th>主图</th>
			<th>操作</th>
		</tr>
</thead>
<c:forEach items="${collection }" var="dish">
<tr>
	<td><input type="text"  name="proname" value="${dish.dishid }"></td>
	<td><input type="text"  name="dishname" value="${dish.dishname }"></td>
	<td></td>
	<td><a href="${pageContext.request.contextPath}/delcollection.action?cid=${uid}"></a></td>
</tr>
</c:forEach>
</table> --%>
<center><h1>我的收藏</h1></center>
<table class="table table-striped table-bordered">
			<thead style="color: red; font-size: 20px;">
				<tr>
					<th style="text-align: center;">ID</th>
					<th style="text-align: center;">菜名</th>
					<th style="text-align: center;">主图</th>
					<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody style="text-align: center;">
			  <c:forEach items="${collection }" var="dish">
				<tr>
					<td>${dish.dishid}</td>
					<td>${dish.dishname }</td>				
					<td>
					<div class="thumbnail">
						<img src="img/${dish.photo}"
							style="width: 50%; height: 300px;" alt="wutu">
						<div class="caption">
						</div>
					</div>
					</td>
					<td>					
					  <a class="btn btn-danger glyphicon glyphicon-trash" href="${pageContext.request.contextPath }/delcollection.action?cid=${dish.dishid }">删除</a>															  					
					</td>
				</tr>
			  </c:forEach>			
			</tbody>			
		</table>		 

</body>
</html>
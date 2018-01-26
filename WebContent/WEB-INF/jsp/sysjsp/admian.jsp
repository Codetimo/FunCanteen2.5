<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<title>管理员界面</title>
</head>
<body>
    <div class="modal fade" id="addadminmodel">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	 </div>
	 
	 <div class="modal fade" id="updateadminmodel">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	 </div>

<table class="table table-striped table-bordered">
			<thead style="color: blue; font-size: 20px;">
			    <tr>
			       <th style="text-align: center;" colspan="6">已有商家信息如下，请对下列新信息进行核对并调整</th>
			    </tr>
				<tr>
					<th style="text-align: center;">窗口名</th>
					<th style="text-align: center;">所属食堂</th>
					<th style="text-align: center;">密码</th>
					<th style="text-align: center;">操作1</th>
					<th style="text-align: center;">操作2</th>
					<th style="text-align: center;">操作3</th>
				</tr>
			</thead>
			<tbody style="text-align: center;">
			  <c:forEach items="${winlist }" var="window">
				<tr>
					<td>${window.windowname}</td>
					<td>${window.canid }</td>
					<td>${window.winpwd}</td>
					<td>
					  <a class="btn btn-danger glyphicon glyphicon-trash" href="${pageContext.request.contextPath}/deletewin.action?wid=${window.windowid}">删除</a>
					</td>
					<td>										  										
					  <a class="btn btn-warning glyphicon glyphicon-edit" href="${pageContext.request.contextPath}/goupdatewin.action?wid=${window.windowid}" data-toggle="modal" data-target="#updateadminmodel">修改</a>					
					</td>
					<td>										  										
					  <a class="btn btn-warning glyphicon glyphicon-plus" href="${pageContext.request.contextPath}/goinsertWin.action" data-toggle="modal" data-target="#addadminmodel">添加</a>					
					</td>
				</tr>
			  </c:forEach>			
			</tbody>			
		</table>
		<a class="btn btn-danger" href="${pageContext.request.contextPath }/goback.action">注销</a>	
</body>
</html>
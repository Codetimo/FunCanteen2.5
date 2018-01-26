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
<title>超级管理员管理界面</title>
</head>

<body>
   
   <div class="modal fade" id="addsupermodel">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	 </div>
	 
	 <div class="modal fade" id="updatesupermodel">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	 </div>
<%-- <a href="${pageContext.request.contextPath}/goinsertAdmin.action">添加</a> 
<table>
<c:forEach items="${adminlist}" var="admin">
<tr>
 <td>
     <input type="text"  value="${admin.adminname}" >
     <input type="text" value="${admin.adminpwd}" > 
     <a href="${pageContext.request.contextPath}/deleteAdmin.action?adminId=${admin.adminid} ">删除</a> 
<a href="${pageContext.request.contextPath}/goupdateadmin.action?adminId=${admin.adminid} ">修改管理员</a>                                                                              ">
 </td>
</tr>
</c:forEach>
</table> --%>
      <table class="table table-striped table-bordered">
			<thead style="color: green; font-size: 20px;">
			    <tr>
			       <th style="text-align: center;" colspan="6">请对管理员进行管理</th>
			    </tr>
				<tr>
					<th style="text-align: center;">管理员名称</th>
					<th style="text-align: center;">管理员密码</th>
					<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody style="text-align: center;">
			  <c:forEach items="${adminlist }" var="admin">
				<tr>
					<td>${admin.adminname}</td>
					<td>${admin.adminpwd}</td>
					<td>
					  <a class="btn btn-danger glyphicon glyphicon-trash" href="${pageContext.request.contextPath}/deleteAdmin.action?adminId=${admin.adminid}">删除</a>														  										
					  <a class="btn btn-warning glyphicon glyphicon-edit" href="${pageContext.request.contextPath}/goupdateadmin.action?adminId=${admin.adminid}" data-toggle="modal" data-target="#updatesupermodel">修改</a>															  										
					  <a class="btn btn-primary glyphicon glyphicon-plus" href="${pageContext.request.contextPath}/goinsertAdmin.action" data-toggle="modal" data-target="#addsupermodel">添加</a>					
					</td>
				</tr>
			  </c:forEach>			
			</tbody>			
		</table>	
		 <a class="btn btn-danger" href="${pageContext.request.contextPath }/goback.action">注销</a>
</body>
</html>
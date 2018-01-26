<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/icon.png">
<link rel="stylesheet" href="//apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css" rel="external nofollow">
<link rel="stylesheet" href="css/font-awesome.css" rel="external nofollow" type="text/css"></link>
<link rel="stylesheet" href="css/ui.css" rel="external nofollow" type="text/css"></link>
<link rel="stylesheet" href="css/form.css" rel="external nofollow" type="text/css"></link>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<title>我的地址</title>
</head>
<body>
   <div class="modal fade" id="addmyaddress">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	</div>
	
	<div class="modal fade" id="upadetmyaddress">
		<div class="modal-dialog modal-md">
			<!--窗口声明-->
			<div class="modal-content">
				<!--内容声明-->
			</div>
		</div>
	</div>
<%-- <table>
<c:forEach items="${useraddress}" var="add">
<tr>
 <td><input type="text"  value="${add.address}" name="address">
     <input type="hidden" value="${add.addid}" name="addid">   
     <input type="hidden" value="${add.userid}" name="userid">                                                                                      ">
 </td><td>
 <a href="${pageContext.request.contextPath }/gotoAddress.action?addid=${add.addid}">修改</a>
 </td><td>
 <a href="${pageContext.request.contextPath }/delAddress.action?addid=${add.addid}">删除</a>
 </td>
</tr>
</c:forEach>
</table>
<a href="${pageContext.request.contextPath }/goAddress.action">添加</a> --%>
   <table class="table table-striped table-bordered">
			<thead style="color: red; font-size: 20px;text-align:center">
			    <tr>
			       <td colspan="5">编辑我的地址信息</td>
			    </tr>
				<tr>
				    <th style="text-align: center;">地理位置编号</th>
					<th style="text-align: center;">已保存的地理位置</th>
					<th style="text-align: center;">操作1</th>
					<th style="text-align: center;">操作2</th>
					<th style="text-align: center;">操作3</th>
				</tr>
			</thead>
			<tbody style="text-align: center;">
			  <c:forEach items="${useraddress}" var="add">
				<tr>
				    <td>${add.addid}</td>
					<td>${add.address}</td>
					<td>
					   <a class="btn btn-danger glyphicon glyphicon-trash" href="${pageContext.request.contextPath }/delAddress.action?addid=${add.addid}">删除</a>	
					</td>
					<td>										  									
					  <a class="btn btn-warning glyphicon glyphicon-edit" href="${pageContext.request.contextPath }/gotoAddress.action?addid=${add.addid}" data-toggle="modal" data-target="#upadetmyaddress">修改</a>					
					</td>
					<td>										  									
					  <a class="btn btn-info glyphicon glyphicon-plus" href="${pageContext.request.contextPath }/goAddress.action" data-toggle="modal" data-target="#addmyaddress">添加</a>					
					</td>
				</tr>
			  </c:forEach>			
			</tbody>			
		</table>

</body> 
</html>
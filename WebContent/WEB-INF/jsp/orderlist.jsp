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
<title>订单处理界面</title>
</head>
<body>
	
	<table class="table table-striped table-bordered">
			<thead style="color: red; font-size: 20px;">
			    <tr>
	                <th colspan="2">买家基本信息</th>
	                <th colspan="3">菜单基本信息</th>
	                <th rowspan="2">商家操作</th>
	            </tr>
				<tr>
	                <th>买家ID</th>
	                <th>送货地址</th>
	                <th>菜品ID</th>
	                <th>菜品名称</th>
	               <th>菜品出售窗口</th>
	           </tr>
			</thead>
			<tbody style="text-align: center;">
			  <c:forEach items="${orders }" var="order">
				   <tr>
				     <td>${order.orderid}</td>
				     <td>${order.addresses}</td>
				     <td>${order.dishesid}</td>
				     <td>${order.dishname}</td>
				     <td>${order.windid}</td>						
				     <td>

				       <a class="btn btn-warning" href="${pageContext.request.contextPath }/runorder.action?oid=${order.orderid}">派送</a>

				     </td>
			       </tr>
			  </c:forEach>			
			</tbody>			
		</table>
     <a class="btn btn-danger" href="${pageContext.request.contextPath }/orderback.action">返回</a>
</body>
</html>
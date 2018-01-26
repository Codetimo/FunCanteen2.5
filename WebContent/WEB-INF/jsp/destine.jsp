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
<title>我的购物车</title>


<style type="text/css">
	.pic{
		width: 30px;
		height: 18px;
	}
	.pice{
		width: auto;
		height: 30px;
		float: right;
		margin: auto 20px auto ;
	}
	.sec{
		height: 30px;
		width: auto;
		float: right;
		margin:auto 10px 10px auto ;
	}
	.main{
		width: 70%;
		height: 80%;
		background-color: #0099CC;
		
	}
</style>
</head>
<body>
<div>
   <div style="float: left;">
			<div id="navsecond">
				<div id="course">
				<h2>导航栏</h2>
				<ul class="nav nav-tabs">
							<li ><a href="${pageContext.request.contextPath }/dishlist.action">菜品列表</a></li>
							<br />
							<li class="active"><a href="${pageContext.request.contextPath }/usercar.action?uid=${uid}">购物车</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/userlist.action?id=${uid}">个人中心</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/gotopro.action">优惠活动</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/gotoevaluate.action?uid=${uid}&oid=1">进行评价</a></li>
							<br />
						</ul>
				</div>
			</div>
		</div>
	<center>
		<h2 align="center">购物车内已有订单</h2>
		<form action="" method="post">
			<div class="main">
			
					<table style="text-align: center;color:black; font-size: 20px;">
						<tr> <td width="180px">菜品名称</td> <td width="90px"> 单价/元</td> <td width="200px">操作 </td></tr>
						<c:forEach items="${cars}" var="car">
							<tr>
								<td>${car.dishname}</td>
								
								<td>${car.price}</td>
																
								<td>
									<a href="#zzz"><img src="img/del.png" style="width: 16px;height: 16px;"></a>
									1
									<a href="#zzz"><img src="img/add.png" style="width: 16px;height: 16px;"></a>
									&nbsp;
									<a href="#zzz"><img src="img/delete.png" style="width: 16px;height: 16px;"></a>
								</td>
							</tr>
						</c:forEach>
					</table>	
				<div class="pice">
					<a style="color:red; font-size: 20px;">订单总额: ${mprice}元</a>
					<p>
						<a class="btn btn-warning glyphicon glyphicon-trash" href="${pageContext.request.contextPath }/delAllCar.action">清除购物车</a>
						<a class="btn btn-info glyphicon glyphicon-hand-up" href="${pageContext.request.contextPath }/pay.action?price=${mprice}">确认下单</a>
						<a class="btn btn-info glyphicon glyphicon-arrow-left" href="${pageContext.request.contextPath }/dishlist.action?uid=${uid}">返回主页面</a>
					</p>
				</div>	
				
			</div>
			
		</form>
	</center>
</div>	
</body>
</html>

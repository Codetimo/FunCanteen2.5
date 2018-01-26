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
<title>用户信息界面</title>
</head>
<body style="background: url(img/hotel4.png) repeat; background-size: cover;">
<div>
  <div style="float: left;">
			<div id="navsecond">
				<div id="course">
				<h2>导航栏</h2>
				<ul class="nav nav-tabs">
							<li ><a href="${pageContext.request.contextPath }/dishlist.action">菜品列表</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/usercar.action?uid=${uid}">购物车</a></li>
							<br />
							<li class="active"><a href="${pageContext.request.contextPath }/userlist.action?id=${uid}">个人中心</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/gotopro.action">优惠活动</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/gotoevaluate.action?uid=${uid}&oid=1">进行评价</a></li>
							<br />
						</ul>
				</div>
			</div>
		</div>
  <div style="width:700px;margin:0 auto">
  <table class="table table-striped table-bordered">
                <tr style="font-size: 20px;text-align:center">
                     <td colspan="2">我的 个人信息和操作记录</td>
                </tr>
				<tr style="font-size: 20px;text-align:center">
                     <td>ID</td>
                     <td>${userlist.userid }</td>
				</tr>
				     
			    <tr style="font-size: 20px;text-align:center">
                     <td>用户名</td>
				     <td>${userlist.username }</td>
				</tr>
				
				<tr style="font-size: 20px;text-align:center">
                     <td>性别</td>
                     <td>${userlist.sex }</td>
				</tr>
				<tr style="font-size: 20px;text-align:center">
                     <td>电话</td>
                     <td>${userlist.phone }</td>
				</tr>
				
				<tr style="font-size: 20px;text-align:center">
                     <td>地址</td>
                     <td>${userlist.address }</td>
				</tr>
				
				<tr style="font-size: 20px;text-align:center">
				     <td>收藏</td>
				     <td><a class="btn btn-warning glyphicon glyphicon-heart" href="${pageContext.request.contextPath }/userCollection.action?id=${userlist.userid }">我的收藏</a></td>
				</tr>
				
				<tr style="font-size: 20px;text-align:center">
				     <td>评价</td>
				     <td><a class="btn btn-success glyphicon glyphicon-bullhorn" href="${pageContext.request.contextPath }/userEvaluate.action?id=${userlist.userid }">我的评价</a></td>
				</tr>
				
				<tr style="font-size: 20px;text-align:center">
				     <td>地址</td>
				     <td><a class="btn btn-info glyphicon glyphicon-map-marker" href="${pageContext.request.contextPath }/userAddress.action?id=${userlist.userid }">我的地址</a></td>
				</tr>
		</table>
		</div>
	</div>
</body>
</html>
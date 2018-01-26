<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" />
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/mainJs.js"></script>
<link rel="shortcut icon" href="img/icon.png">
<title>菜品信息更新模态框</title>
</head>
<body>
<%-- <h3>模态框形式显出</h3>
<form action="${pageContext.request.contextPath }/updateDish.action" method="post" enctype="multipart/form-data">
<input type="hidden" name="did" value="${dish.dishid }">
<table width="100%" border=1>
<tr>
	<td>菜名</td><td><input type="text" name="dishname" value="${dish.dishname }"/></td>
</tr><tr>
	<td>价格</td><td><input type="text"  name="price"  value="${dish.price }"/> </td>
</tr><tr>
	<td>图片</td><td><c:if test="${dish.photo !=null}">
						<img src="/pic/${dish.photo }" width=100 height=100/>
						<br/>
					</c:if>
					<input type="file" name="photo"/></td>
</tr>    
</table>
<input type="submit" value="提交">
</form> --%>
<div class="modal-content" id="updatelove">
		<!--内容声明-->
		<div class="modal-header">
			<button class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">修改菜品信息</h4>
		</div>
		<div class="modal-body">
			<form  action="${pageContext.request.contextPath }/updateDish.action"  name="f2" method="post"
				enctype="multipart/form-data">
				<div class="container-fluid">
					<table class="table">
					    <tr>
					        <td>ID：</td>
					        <td><input type="hidden" name="did" value="${dish.dishid}"></td>
					    </tr>
						<tr>
							<td>菜名：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="dishname" value="${dish.dishname}" /></td>
						</tr>
						<tr>
							<td>价格：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="price" value="${dish.price}" /></td>
						</tr>						
						<tr>
							<td>主图：</td>
							<td>
							<input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								type="file" name="photo" /></td>
						</tr>
					</table>

				</div>
				<div class="modal-footer">
					<input class="btn btn-info" type="submit" value="添加">
				</div>
			</form>
		</div>
	</div>
</body>
</html>
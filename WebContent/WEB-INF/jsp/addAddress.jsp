<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/icon.png">
<title>添加地址信息模态框?</title>
</head>
<body>
<%-- <h2>添加地址</h2>
<form action="${pageContext.request.contextPath }/insertAddress.action" method="post">
 您的用户名：<input type="text" name="name"/>
 您的详细地址：<input type="text" name="address"/>
 <input type="submit" value="提交">
</form> --%>

    <div class="modal-content" id="addmyaddress">
		<!--内容声明-->
		<div class="modal-header">
			<button class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">添加新的地理位置</h4>
		</div>
		<div class="modal-body">
			<form  action="${pageContext.request.contextPath }/insertAddress.action"  name="f10" method="post"
				enctype="multipart/form-data">
				<div class="container-fluid">
					<table class="table">
						<tr>
							<td>我的用户号：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="uid" value="${uid}" /></td>
						</tr>
						<tr>
							<td>地理位置信息：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="address" value=" " /></td>
						</tr>						
					</table>

				</div>
				<div class="modal-footer">
					<input class="btn btn-info" type="submit" value="确定">
				</div>
			</form>
		</div>

	</div>
</body>
</html>
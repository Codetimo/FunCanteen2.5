<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>添加菜品模态框</title>
</head>
<body>
<div class="modal-content" id="mylove">
		<!--内容声明-->
		<div class="modal-header">
			<button class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">添加新菜品</h4>
		</div>
		<div class="modal-body">
			<form  action="${pageContext.request.contextPath }/addDish.action"  name="f1" method="post"
				enctype="multipart/form-data">
				<div class="container-fluid">
					<table class="table">
						<tr>
							<td>菜名：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="dishname" value=" " /></td>
						</tr>
						<tr>
							<td>价格：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="price" value=" " /></td>
						</tr>						
						<tr>
							<td>主图：</td>
							<td><input
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
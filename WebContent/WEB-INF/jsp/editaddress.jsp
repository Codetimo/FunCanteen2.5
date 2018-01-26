<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/icon.png">
<title>修改地址信息模态框</title>
</head>
<body>
<%-- <h2>编辑地址</h2>
<form action="${pageContext.request.contextPath }/upAddress.action" method="post">
<input type="hidden" name="addid" value="${address.addid }"/>
 您的用户名：<input type="text" name="userid" value="${address.userid }"/>
 您的详细地址：<input type="text" name="address" value="${address.address}"/>
 <input type="submit" value="保存">
</form> --%>

   <div class="modal-content" id="upadetmyaddress">
		<!--内容声明-->
		<div class="modal-header">
			<button class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">修改地理位置信息</h4>
		</div>
		<div class="modal-body">
			<form action="${pageContext.request.contextPath }/upAddress.action"  name="f9" method="post"
				enctype="multipart/form-data">
				<div class="container-fluid">
					<table class="table">
					    <tr>
							<td>地理位置编号：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="addid" value="${address.addid }" /></td>
						</tr>
					
						<tr>
							<td>我的用户名：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="userid" value="${address.userid }" /></td>
						</tr>
						<tr>
							<td>地理位置信息：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="address" value="${address.address}" /></td>
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
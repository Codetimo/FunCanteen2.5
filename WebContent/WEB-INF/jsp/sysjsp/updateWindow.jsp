<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商户窗口模态框</title>
</head>
<body>
<div class="modal-content" id="updateadminmodel">
		<!--内容声明-->
		<div class="modal-header">
			<button class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">修改商家信息</h4>
		</div>
		<div class="modal-body">
			<form  action="${pageContext.request.contextPath}/updatewin.action?wid=${win.windowid}"  name="f5" method="post"
				enctype="multipart/form-data">
				<div class="container-fluid">
					<table class="table">
						<tr>
							<td>窗口名：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="wname" value="${win.windowname}" /></td>
						</tr>
						
						<tr>
							<td>商户密码：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								type="password" name="wpwd" value="${win.winpwd}"/></td>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改管理员模态框</title>
</head>
<body>

<div class="modal-content" id="updatesupermodel">
		<!--内容声明-->
		<div class="modal-header">
			<button class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">修改管理员信息</h4>
		</div>
		<div class="modal-body">
			<form  action="${pageContext.request.contextPath}/updateadmin.action?adminid=${admin.adminid}"  name="f7" method="post"
				enctype="multipart/form-data">
				<div class="container-fluid">
					<table class="table">
						<tr>
							<td>管理员名称：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								name="aname" value="${admin.adminname}" /></td>
						</tr>						
						<tr>
							<td>管理员密码：</td>
							<td><input
								style='background: none; border: 1px rgba(0.5); border-radius: 6px;'
								type="password" name="apwd" value="${admin.adminpwd}"/></td>
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
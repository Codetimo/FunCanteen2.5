<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/loginregister.action">
<table>
<tr>
 <td>个人名</td><td><input name="username"></td>
</tr>
<tr>
 <td>密码</td><td><input name="pwd"></td>
</tr>
<tr>
 <td>确认密码</td><td><input name="newpwd"></td>
</tr>
<h3> ${error}</h3>
<tr>
 <td>电话</td><td><input name="phone"></td>
</tr>
<tr>
 <td>性别</td><td><input name="sex"></td>
</tr>
<tr>
 <td>地址</td><td><input name="address"></td>
</tr>
</table>
<input type="submit" value="提交">
</form>
</body>
</html>
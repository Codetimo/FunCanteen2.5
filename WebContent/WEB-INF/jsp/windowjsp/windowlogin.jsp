<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/loginJs.js"></script>
<link rel="shortcut icon" href="img/icon.png">
<link rel="stylesheet" href="css/login.css" />
<title>商户入口</title>
</head>
<body onload="changeImg()">
         <h2>商户入口</h2>
		<div class="main_bar">
			<div id="login_form" class="login_form">
				<div class="title"></div>
				<form action="${pageContext.request.contextPath }/winlogin.action" method="post">
					<div id="form_widgt">
						<input type="text" name="winname" class="name" placeholder="请输入商户名"><br>
						<input type="password" name="winpwd" class="pwd"  placeholder="请输入密码">
						<h4>${error}</h4>
						<br>
						<p class="yzm"><input type="text" name="code" id="codeInput" class="code" placeholder="验证码">
						<span id="code" class="code_pic" title="看不清，换一张"></span></p>
						<p class="errorTips" id="errorTips"></p>
						<input type="submit" name="sbm" class="sbm_btn" onclick="return check()" value="确定">
					</div>
				</form>
				<div class="re_pwd"><a href="">忘记密码了</a></div>
			</div>
		</div>
		
	</body>
</html>
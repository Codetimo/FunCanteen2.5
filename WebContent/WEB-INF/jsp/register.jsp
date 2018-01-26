<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册界面</title>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<style type="text/css">
.erro {
	font-size: 16px;
	color: #f00;
	display: none;
	text-align: center;
}
.main_bar{
	width:50%; 
	height: 430px;
	margin-top:150px;
				
}

.mune{
    width:60%;
    margin:0 50 0 auto; 
    /*border:2px solid #16A085;*/ 
 	border-radius: 15px; 
	padding:10px; 
	background-color:rgba(112,83,41,0.8);
}
.auth{
	display:block;
	width:50%;
	margin:0 auto;
	height:35px;
	font-size:16px;
	border-color: transparent;
	background-color:mistyrose;
	border-radius: 5px;
	border:1;
	padding-left:8px;
}
.btn{
	width: 18%;
	height: auto;
	text-align: center;
	background-color:#13a98b ;
	border-color: transparent;
	color:#fff;
	line-height: 30px;
}

</style>
</head>
<body style="background: url(img/bg2.jpg) repeat; background-size: cover;">
	<div class="main_bar">
		<form action="${pageContext.request.contextPath}/loginregister.action">
			<div class="mune">
				<center>
				<h1>用户信息注册</h1>
				
					<input type="text" name="username" id="username" class="auth" placeholder="请输入用户名">
					<span class="erro">用户名至少6位!</span><br />
				
					<input type="password" name="password" id="password" class="auth" placeholder="请设置您的密码"> 
					<span class="erro">密码至少6位!</span><br />
				
					<input type="password" name="repassword" id="repassword" class="auth" placeholder="再次输入您的密码">
					<span class="erro">两次输入密码不一致!</span><br />
				
				    <select name="sex" class="auth" >
						<option selected="selected">请选择性别</option>
						<option value="男">男</option>
						<option value="女">女</option>
					</select><br />
				    
					
					<input type="text" name="phone" id="phone" class="auth" placeholder="请填写你的手机号码">
					<span class="erro">手机号码必须为11位!</span><br />
					
					<input type="text" name="address" id="address" class="auth" placeholder="请填写您的地址">
					<span class="erro">地址信息必须包含中文字符!</span><br />
					
					<input class="btn" type="submit" value="注册" />
				</center>	
				
					
			</div>
			
		</form>
</div>
</body>


	<script type="text/javascript">
		//验证用户名信息
		$('#username').blur(function() {
			//获取输入标签的值
			val = $(this).val();
			if (val.length < 2) {
				//显示下一个标签的内容
				$(this).next().show();
				//不合法给0值
				$(this).data({
					's' : 0
				});
			} else {
				//隐藏下一个标签的内容
				$(this).next().hide();
				//合法给1值
				$(this).data({
					's' : 1
				});
			}
		});
		//验证密码信息
		$('#password').blur(function() {//blur当标签失去焦点的时候执行
			//获取输入标签的值
			val = $(this).val();
			if (val.length < 6) {
				//显示下一个标签的内容
				$(this).next().show();
				//不合法给0值
				$(this).data({
					's' : 0
				});
			} else {
				//隐藏下一个标签的内容
				$(this).next().hide();
				//合法给1值
				$(this).data({
					's' : 1
				});
			}
		});
		//验证确认密码信息
		$('#repassword').blur(function() {//.blur()当标签失去焦点的时候执行
			val = $(this).val();//获取确认密码框的值
			prev = $('#password').val(); //获取密码框中的值
			if (val != prev) {
				//显示下一个标签的内容
				$(this).next().show();
				//不合法给0值
				$(this).data({
					's' : 0
				});//.data()给某个标签添加值/获取附加值
			} else {
				//隐藏下一个标签的内容
				$(this).next().hide();
				//合法给1值
				$(this).data({
					's' : 1
				});
			}
		});
		
		//验证手机号码信息
		$('#phone').blur(function() {
			//获取输入标签的值
			val = $(this).val();
			if (val.length != 11) {
				//显示下一个标签的内容
				$(this).next().show();
				//不合法给0值
				$(this).data({
					's' : 0
				});
			} else {
				//隐藏下一个标签的内容
				$(this).next().hide();
				//合法给1值
				$(this).data({
					's' : 1
				});
			}
		});
		//验证地址信息
		$('#address').blur(function() {//.blur()当标签失去焦点的时候执行
			val = $(this).val();//获取输入框的值
			//使用正则表达式匹配邮箱
			if (escape(val).indexOf("%u") == -1) {//i不区分大小写
				//显示下一个标签的内容
				$(this).next().show();
				//不合法给0值
				$(this).data({
					's' : 0
				});//.data()给某个标签添加值/获取附加值
			} else {
				//隐藏下一个标签的内容
				$(this).next().hide();
				//合法给1值
				$(this).data({
					's' : 1
				});
			}
		});
		//验证邮箱信息
		$('#email').blur(function() {//.blur()当标签失去焦点的时候执行
			val = $(this).val();//获取输入框的值
			//使用正则表达式匹配邮箱
			if (val.match(/^\w+@\w+\.\w+$/i) == null) {//i不区分大小写
				//显示下一个标签的内容
				$(this).next().show();
				//不合法给0值
				$(this).data({
					's' : 0
				});//.data()给某个标签添加值/获取附加值
			} else {
				//隐藏下一个标签的内容
				$(this).next().hide();
				//合法给1值
				$(this).data({
					's' : 1
				});
			}
		});
		//当点击button按钮会触发的方法
		$(':button').click(function() {
			$('#username').blur();
			$('#password').blur();
			$('#repassword').blur();
			$('#phone').blur();
			$('#address').blur();
			$('#email').blur();

			sum = 0;
			$('.auth').each(function() {//.each()循环遍历整个标签的值将满足条件的值相加
				sum += $(this).data('s');
			});
			if (sum == 6) {
				//提交表单
				$('form').submit();
				alert("恭喜您注册成功!");
			}

		});
	</script>
</html>
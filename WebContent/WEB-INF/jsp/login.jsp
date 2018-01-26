<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/icon.png">
 <title>用户登录</title>
<style type="text/css">
			*{
				margin:0;
				padding:0;
			}	
			a{
				text-decoration: none;
			}
			.main_bar{
				width:100%;
				height: 430px;
				margin-top:150px;
				
			}
			.login_form{
				width:25%;
				height:430px;
				
				margin:0 50 0 auto;
				/*border:2px solid #16A085;*/
				border-radius: 15px;
				padding:10px;
				background-color:rgba(112,83,41,0.8);
				
				position: absolute;
				
				right:10%;
				
			}
			.name,.pwd,.sbm_btn{
				display:block;
				width:70%;
				margin:0 auto;
				height:35px;
				font-size:16px;
				border-color:transparent;
				border-radius: 5px;
				border:0;
				padding-left:8px;
				
			}
			.select{
				width: 26%;
				margin-left:50px;
				height:35px;
				font-size:16px;
				border-color:transparent;
				border-radius: 5px;
				border:0;
				padding-left:8px;
			}
			.yzm{
				height: 35px;
				margin:20 auto;
				width: 72%;
				line-height: 35px;
				position: relative;
				margin-bottom: 10px;
			}
			.code{
				width:50%;
				height: 35px;
				border:0;
				border-color: transparent;
				font-size:16px;
				border-radius: 5px;
				padding-left: 8px;
				position: absolute;
				top: 0px;
				left:18%;
			}
			.code_pic{
				display: block;
				width:40%;
				height:35px;
				background-color: #34495e;
				color:#FFF;
				position: absolute;
				top: 0px;
				left:80%;
				border-radius: 5px;
				text-align: center;
			}
			.name{
				margin-top:20px;
			}
			.sbm_btn{
				text-align: center;
				background-color: #1abc9c;
				color:#fff;
				line-height: 35px;
			}
			.re_pwd {
			    width: 50%;
			    margin: 10px auto 10px;
			}
			.re_pwd a ,p{
				text-decoration: none;
				font-size:14px;
				color: #ccc;
			}
			.re_pwd a:hover{
				cursor: pointer;
				color:#16A085;
			}
			.errorTips{
				width:70%;
				color:red;
				font-size: 14px;
				margin:0 auto;
				height: 20px;
				line-height:20px;
			}
			.leader{
				height: 10%;
				width: 100%; 
				margin: 0 auto auto auto 0;
			}
			.p_title{
				font-size: 25px;
				color: rosybrown;
				
			}
			
		</style>
</head>
<body onload="changeImg()" style="background: url(img/bg3.jpg) repeat; background-size: cover;">
		<div class="main_bar">
			<div id="login_form" class="login_form">
				<div class="leader">
				<p align="center" class="p_title">登录</p>
			
				</div>
				<form action="${pageContext.request.contextPath }/login.action" method="post">
					<div id="form_widgt">
						<input type="text" name="username" class="name" placeholder="请输入账号"><br>
						<input type="password" name="userpwd" class="pwd"  placeholder="请输入密码"><br>
						

						<select class="select" name="identity">
						<option value="0"> 用户 </option>
						<option value="1"> 商家 </option>
						<option value="2"> 管理员 </option>
						<option value="3"> 超级管理员 </option>
						</select>
                      
						


                    <br /><br />
						
						
						
						<p class="yzm">
						&nbsp;&nbsp;&nbsp;
						<input type="text" name="code" id="codeInput" class="code"  placeholder="验证码">
						&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;
						<span id="code" class="code_pic" title="看不清，换一张"></span></p>
						<p class="errorTips" id="errorTips"></p>
						<h2>${error} </h2>
						<input type="submit" name="sbm" class="sbm_btn" onclick="return check()" value="登录">
					</div>
				</form>
				<div class="re_pwd">
					<p>切换至
					<a href="${pageContext.request.contextPath}/forlogin.action">注册</a>
					|
					<a href="${pageContext.request.contextPath}/logingoforpassword.action">忘记密码</a>
					</p>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			// 声明一个变量用于存储生成的验证码
			document.getElementById('code').onclick = changeImg;
			function changeImg(){
				// 验证码组成库
				var arrays=new Array(  
	                '1','2','3','4','5','6','7','8','9','0',  
	                'a','b','c','d','e','f','g','h','i','j',  
	                'k','l','m','n','o','p','q','r','s','t',  
	                'u','v','w','x','y','z',  
	                'A','B','C','D','E','F','G','H','I','J',  
	                'K','L','M','N','O','P','Q','R','S','T',  
	                'U','V','W','X','Y','Z'               
            	); 
				// 重新初始化验证码
				code ='';
				// 随机从数组中获取四个元素组成验证码
				for(var i = 0; i<4; i++){
					// 随机获取一个数组的下标
					var r = parseInt(Math.random()*arrays.length);
					code += arrays[r];
				}
				// 验证码写入span区域
				document.getElementById('code').innerHTML = code;

			}

			// 验证验证码
			function check(){
				var error;
				// 获取用户输入的验证码
				var codeInput = document.getElementById('codeInput').value;
				if(codeInput.toLowerCase() == code.toLowerCase()){
					console.log('123');
					return true;
				}else{
					error = '验证码错误，重新输入';
					document.getElementById('errorTips').innerHTML = error;
					return false;
				}
			}
		</script>
	</body>
</html>
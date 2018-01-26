<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/icon.png">
<title>找回密码</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet" href="assets/css/supersized.css">
<link rel="stylesheet" href="assets/css/style.css">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script src="js/jquery.validate.min.js" type="text/javascript"></script>

</head>
<body>
	
	<div class="page-container">
            <h1>重置密码</h1>
            <form id="registerform" action="${pageContext.request.contextPath}/loginRepassword.action" method="post" >
                <input type="text" id="userphone" name="userphone" class="userphone" placeholder="请输入您的手机号码">
                <label for="userphone" class="col-sm-2 control-label"></label>

                 <input type="text" name="checkCode" class="password" style="margin-left:-50px; width: 135px;" placeholder="验证码">
                 <label for="code" ></label>
                <button type="button" id="getCode" style="width: 120px;" onclick="getMessage()">获取验证码</button>
                
                <input type="text" name="uppwd" placeholder="请输入新密码">
          
                <input type="text" name="downpwd" placeholder="请再次输入新密码">
                <h2>${error} </h2>

                <button type="submit" >提交</button>
                <div class="error"><span>+</span></div>
            </form>
            
            
            <div class="connect">
                <p>Or connect with:</p>
                <p>
                    <a class="facebook" href=""></a>
                    <a class="twitter" href=""></a>
                </p>
            </div>
     </div>
	
	
	<script type="text/javascript">
	$(function()    {

	 	$("#registerform").validate({

			rules : {
				
				"userphone" : {
					"required" : true,
					"minlength" : 11,

				},
				"checkCode" : {
					"digits" : true,
					"required" : true,
					"ischeckCode" : true,
				},
			},

			messages : {
			
				"userphone" : {
					"required" : "请输入手机号",
					"minlength" : "确认手机不能小于11个字符",
				},

				"checkCode" : {
					"required" : "请输入验证码",
					"digits" : "验证码应该输入数字",
					"ischeckCode" : "验证码不符"
				},
			}
		});
	}) 

	function getMessage() {

		/*   发送验证码 */

		alert($("#userphone").val());
		 $("#getCode").removeAttr("disabled");

		$.ajax({
			url : "${pageContext.request.contextPath }/loginsendMessage.action",
			data : {
				"userphone" : $("#userphone").val()
			},
			type : "post",
			async : true,
			dataType : "text",
			success : function(data) {
				if (data == 'true') {
					alert("验证码发送成功，收到后请输入验证码");
					time(this);
				} else {
					alert("验证码发送失败");
				}
			},
			error : function() {
				alert("error");
			}
		}); 

	}

	//验证码倒计时  
	var wait = 60;
	function time(obj) {
		if (wait == 0) {
			$("#getCode").removeAttr("disabled");
			$("#getCode").val("获取验证码");
			wait = 60;
		} else {
			$("#getCode").attr("disabled", "true");
			$("#getCode").val(wait + "秒后重试");
			wait--;
			setTimeout(function() { //倒计时方法  
				time(obj);
			}, 1000); //间隔为1s  
		}
	}
	$.validator.addMethod("ischeckCode", function(value, element) {
		var flag = false;
		$.ajax({
			"async" : false,
			"url" : "${pageContext.request.contextPath }/loginischeckCode.action",
			"data" : {
				"code" : value
			},
			"type" : "POST",
			"dataType" : "json",
			"success" : function(data) {
				alert("恭喜您重置密码成功！");
				flag = data.isExist;
				
			},
			"error": function(data){
				alert("lost");				
			}
		});
		return flag;
	});
	</script>
	
	<script src="assets/js/jquery-1.8.2.min.js"></script>
    <script src="assets/js/supersized.3.2.7.min.js"></script>
    <script src="assets/js/supersized-init.js"></script>
    <script src="assets/js/scripts.js"></script>

</body>
</html>
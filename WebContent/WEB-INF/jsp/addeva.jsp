<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>填写您的评价吧<</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js "></script>
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="shortcut icon" href="img/icon.png">
<link href="file/static/css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="file/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="file/static/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="file/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script src="file/static/js/fileinput_locale_de.js" type="text/javascript"></script>
<script src="file/static/js/fileinput.js"
	type="text/javascript"></script>
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>  
<script type="text/javascript" src="js/jquery.raty.js"></script>
<script type="text/javascript" src="js/star-rating.js"></script>
<style>
html {
	overflow-x: hidden;
	overflow-y: auto;
}

.form-horizontal {
	overflow-x: hidden;
	overflow-y: auto;
}
</style>
</head>
<body style="background: url(img/hotel3.png) repeat; background-size: cover;">
<div>
   <div style="float: left;">
			<div id="navsecond">
				<div id="course">
				<h2>导航栏</h2>
				<ul class="nav nav-tabs">
							<li ><a href="${pageContext.request.contextPath }/dishlist.action">菜品列表</a></li>
							<br />
							<li ><a href="${pageContext.request.contextPath }/usercar.action?uid=${uid}">购物车</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/userlist.action?id=${uid}">个人中心</a></li>
							<br />
							<li ><a href="${pageContext.request.contextPath }/gotopro.action">优惠活动</a></li>
							<br />
							<li class="active"><a href="${pageContext.request.contextPath }/gotoevaluate.action?uid=${uid}&oid=1">进行评价</a></li>
							<br />
						</ul>
				</div>
			</div>
		</div>
	<form class="form-horizontal" role="form" autocomplete="off"
		method="post"
		action="${pageContext.request.contextPath }/addeva.action"
		enctype="multipart/form-data">
		<br> <br> 
		<input type="hidden" name="uid" value="${uid}">
		<input type="hidden" name="ordeid" value="${oid}">
		
		<div class="form-group">
			<label class="col-sm-2 control-label">星级评价</label>
			<div class="col-sm-2">
			<div id="star"></div>
            <div id="result"></div>
            </div>
            <div class="col-sm-6">
			<input type="text" class="form-control" id="evastar" name="evastar"
				style="display: none;"	placeholder="请输入星级评价" required="required">
			</div>
		</div>
		
       <div class="form-group">
			<label class="col-sm-2 control-label">晒图评价</label>
			<div class="col-sm-8">
				<input id="file-4" type="file" multiple class="file"
					data-upload-url="${pageContext.request.contextPath}/comment/eva"
					name="evaluatepic" required="required">
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">文字评价</label>
			<div class="col-sm-8">
				<textarea class="form-control" rows="4" name="evaluatecontent"
					maxlength="300" required="required"></textarea>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary" data-dismiss="modal"
					ng-click="carAdd()" name="sava">保存</button>
				<button type="reset" class="btn btn-danger"
					ng-click="carDelete($index)" name="reset">重置</button>
			</div>
		</div>
	</form>
</div>
<script type="text/javascript">
 $(function(){
  $("#star").raty(   
  {
   hints:["差劲","一般","还好","佳","极品"],
   path:"img",
   starOn:"stars2.png",
   starOff:"stark2.png",
   size:100,
   target:"#result",//存放选择的值
   click:function(score,eva)
   {   
	   $("#evastar").val(score);
	       	      
   }
  });
 });	    
 </script>	
<script type="text/javascript">
	$(function() {
		$(".form-horizontal").validate({
			rules : {
				evastar : {
					required : true,
				},
			},
			focusInvalid : false,
			onkeyup : false,
			focusCleanup : true,
			success : "valid",
			submitHandler : function(form) {
				form.submit();
			}
		});
	});
</script>

<script>
	$("#file-4").fileinput({
		uploadUrl : "${ctx}/comment/eva", 
		allowedFileExtensions : [ 'jpg', 'png', 'gif' ],
		overwriteInitial : false,
		maxFileSize : 10000,
		maxFilesNum : 20,
		allowedFileTypes : [ 'image', 'video', 'flash' ],
		slugCallback : function(filename) {
			return filename.replace('(', '_').replace(']', '_');
		}
	});
	$("#myselect").change(function() {
		var opt = $("#myselect").val();
	});

	function check_black() {
		var blackName = document.getElementsByName("projectLanguage");
		return blackName;
	};
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="img/icon.png">
<title>主页</title>
<%@ include file="/include/head.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {
		
	});
	function page(n){
		$("#pageNo").val(n);
		$("#searchForm").submit();
       	return false;
       }
</script>
</head>

<body>
	<div class="container-fluid">

		<ul class="nav nav-tabs">
			<li><a href="${adminPath}/dish?method=list">选择菜品</a></li>
			<li class="active"><a href="${adminPath}/dish?method=form&id=${dish.id}">菜品评价</a></li>
		</ul>
		<br />
		<form class="form-horizontal" role="form" action="${adminPath}/dish?method=save" method="post" enctype="multipart/form-data">
			<input type="hidden" name="id" value="${dish.dishid}">
			 
			 <div class="form-group">
			 	<label for="name" class="col-sm-3 control-label">名称</label>
			 	<div class="col-sm-5">
			 			<input type="text" class="form-control" id="name" name="name" placeholder="请输入名称" value="${dish.dishname}">
		    	</div>
			 </div>
			 <div class="thumbnail">
						<img src="${adminPath }/${dish.photo}"
							style="width: 50%; height: 300px;" alt="wutu">
						<div class="caption">
						</div>
						</div>
			 </div>
			<td>
							${dish.winid}
						</td>
			 </div>
			 <div class="form-group">
			 	<label for="name" class="col-sm-3 control-label">价格</label>
			 	<div class="col-sm-5">
			 			<input type="text" class="form-control" id="price" name="price" placeholder="请输入价格" value="${dish.price}">
		    	</div>
			 </div>
			 <div class="form-group">
			 	<label for="name" class="col-sm-3 control-label">订单指数</label>
			 	<div class="col-sm-5">
			 			<input type="text" class="form-control" id="clickNo" name="clickNo" placeholder="请输入订单指数" value="${dish.clickNo}">
		    	</div>
			 </div>
			  

			 <div class="form-group">
			    <label for="sort" class="col-sm-3 control-label"></label>
			    <div class="col-sm-5">
			      	<input type="submit" class="btn btn-success btn-sm" value="保存">
			      	<input type="button" class="btn btn-default btn-sm" value="返回" onclick="history.go(-1)">
			    </div>
			 </div>
		</form>
	</div>
</body>
</html>
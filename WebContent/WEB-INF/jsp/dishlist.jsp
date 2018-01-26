<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>
<%@ include file="/include/head.jsp"%>
<link href="css/base/jquery-ui-1.10.4.custom.css" rel="stylesheet">
<link rel="shortcut icon" href="img/icon.png">
<script src="js/jquery-1.10.2.js"></script>
<script src="js/jquery-ui-1.10.4.custom.js"></script>
<script type="text/javascript">
$(function() {
	 //使用ajax和后台进行交互  ajax的json格式1  {key:value, key:value...}  格式2：["","",""...]   格式3 
	 $.ajax({
	   type:"POST",
	   url:"http://localhost:8080/FunCanteen/foodauto",
	   dataType:"json",
	   success:function(data){
	   //实现自动补全
               	$( "#name" ).autocomplete({
			   		source: data
			});
			   
			   	$( "#price" ).autocomplete({
			   		source: data
			});
	   }
	 });

});
	function page(n){
		$("#pageNo").val(n);
		$("#searchForm").submit();
       	return false;
       }
</script>

<style>
#red{
overflow: hidden;
width: 60%;



}
#blue{
margin: 10px;
width:200px ;
height: 320px;
float: left;
border: 1px solid ;
background-color: rgba(209,238,238, 0.5);

}
.picm{
	font-size: 36px;
	
}

</style>
</head>

<body style="background: url(img/canzhuo.jpg) repeat; background-size: cover;">
    <input type="hidden" value="${uid}" name="uid">
	<div class="container-fluid">
		
	<center>
		<div style="width: 70%; ">
			<p class="picm" style=" font-family: Microsoft YaHei;">我的食堂，我做主</p>
		</div>
		<div style="width: 60%;">
		
				<form style="float: right;" class="form-inline" id="searchForm"
							action="${pageContext.request.contextPath }/onlyselect.action"
							method="post">
							<input id="pageNo" name="pageNo" type="hidden"
								value="${page.pageNo }">
		
							<div class="form-group">
								<label for="exampleInputName2">名称</label> <input type="text"
									class="form-control" name="name" id="name" placeholder="请输入名称"
									value="${dishname}">
							</div>
							<div class="form-group">
								<label for="exampleInputName2">价格</label> <input type="text"
									class="form-control" name="price" id="price"
									placeholder="请输入菜品价格" value="${price}">
							</div>
		
							<button type="submit" class="btn btn-primary btn-sm">
								<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
								查询
							</button>
						</form>
						<br />
		
		</div>
		</center>
			
	<div style="margin:10px">
		<div style="float: left;">
			<div id="navsecond">
				<div id="course">
				<h2>导航栏</h2>
				<ul class="nav nav-tabs">
							<li class="active"><a href="${pageContext.request.contextPath }/dishlist.action">菜品列表</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/usercar.action?uid=${uid}">购物车</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/userlist.action?id=${uid}">个人中心</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/gotopro.action">优惠活动</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/gotoevaluate.action?uid=${uid}&oid=1">进行评价</a></li>
							<br />
						</ul>
				</div>
			</div>
		</div>
					<div id="red" style="margin: 0 auto;">
		
					

				<c:forEach items="${dishlist}" var="dish" >
							<div id="blue">
								<center>
									<div style="width: 180px;height: 180px;" align="center">
										<img src="img/${dish.photo}"
										style="width: 100%; height: 100%;" alt="wutu">
									</div>
								</center>
								<div>
									<table >
										<tr><td>ID: 123</td></tr>
										<tr>
											<td>
												菜名:
												<a href="${adminPath}/dish?method=form&id=${dish.dishid}">
												${dish.dishname}
												</a>
											</td>
										</tr>
										<tr>
											<td>
												价格:${dish.price} 元
											</td>
										</tr>
										<tr>
											<td>
												所属窗口：${dish.winid}
											</td>
										</tr>
									</table>
								</div>
								
								<div style="width: 100%;height: 30px;margin-bottom: 2px;" align="center">
									<a href="${pageContext.request.contextPath }/disheva.action?dishid=${dish.dishid}">
										<img src="img/pinglun.png" />评论
									</a> 
									&nbsp;&nbsp;
									<a href="${pageContext.request.contextPath }/dishdetail.action?uid=${uid}&dishid=${dish.dishid}"><!--预定菜品  -->
										<img src="img/scar.png"  style="width: 16px;width: 16px;"/>选购
										
									</a> 
									&nbsp;&nbsp;
									<a href="${pageContext.request.contextPath }/addcollection.action?did=${dish.dishid}" onclick="return confirm('确认要收藏吗？', this.href)">
										<img src="img/shoucang.png" style="width: 16px;width: 16px;"/>收藏
									</a> 
								</div>
								
							</div>
					</c:forEach>
				</div>
				
</div>
			
			
		<h2>${error}</h2>	
	</div>
</body>
</html>

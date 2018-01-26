<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="shortcut icon" href="img/icon.png">
<link rel="stylesheet" type="text/css" href="file/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="file/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="file/static/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="file/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="file/static/h-ui.admin/css/style.css" />
<title>优惠专栏</title>
</head>
<body style="background: url(img/hotel2.png) repeat; background-size: cover;">

 
<nav class="breadcrumb" ><i class="Hui-iconfont">&#xe67f;</i><a href="javascript:location.replace(location.href);" title="首页" >首页</a> 
<span class="c-gray en">&gt;</span> 优秀活动展示
</nav>
	<div>
	
		
  <div style="float: left;">
			<div id="navsecond">
				<center>
				<div id="course">
				<h2>导航栏</h2>
				<ul class="nav nav-tabs">
							<li ><a  href="${pageContext.request.contextPath }/dishlist.action">菜品列表</a></li>
							<br />
							<li ><a href="${pageContext.request.contextPath }/usercar.action?uid=${uid}">购物车</a></li>
							<br />
							<li><a href="${pageContext.request.contextPath }/userlist.action?id=${uid}">个人中心</a></li>
							<br />
							<li class="active"><a href="${pageContext.request.contextPath }/gotopro.action">优惠活动</a></li>
							<br />
							<li ><a href="${pageContext.request.contextPath }/gotoevaluate.action?uid=${uid}&oid=1">进行评价</a></li>
							<br />
						</ul>
				</div>
				</center>
			</div>
	</div>


		
		<center>
		
		<div class="page-container" style="width: 70%">
			<table class="table table-border table-bordered table-hover table-bg">
				<thead>
					<tr>
						<th scope="col" colspan="6">优惠活动展示</th>
					</tr>			
					<tr class="text-c">
						<th width="100">活动名称</th>
						<th width="200">活动内容</th>
						<th width="100">活动时间</th>
						<th width="70">活动商家</th>
					</tr>
				</thead>
				
				<tbody>
				<c:forEach items="${activity }" var="act">
					<tr class="text-c">
						     <td>${act.proname}</td>		
							<td>${act.content}</td>	
							<td><fmt:formatDate value="${act.time}" pattern="yyyy-MM-dd "/></td>	
							<td>${act.windoid }</td>			
					</tr>
		        </c:forEach>
				</tbody>
			</table>
		</div>
	</center>
	</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="file/static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="file/static/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="file/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="file/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="file/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var msg = '${msg}';
		if(msg!=''){
			layer.msg(msg,{icon:1,time:1000});
		}
	});
</script>
</body>
</html>
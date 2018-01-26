<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script type="text/javascript" src="js/jquery-1.10.2.js"></script> 


<link rel="stylesheet"
	href="//apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="external nofollow">
<link rel="stylesheet" href="css/font-awesome.css"
	rel="external nofollow" type="text/css"></link>
<link rel="stylesheet" href="css/ui.css" rel="external nofollow"
	type="text/css"></link>
<link rel="stylesheet" href="css/form.css" rel="external nofollow"
	type="text/css"></link>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
	<script type="text/javascript" src="js/jquery.raty.js"></script>
	<script type="text/javascript" src="js/star-rating.js"></script> 
<link rel="stylesheet" href="css/windowmain.css" />
<link rel="shortcut icon" href="img/icon.png">
<title>我的评价</title>
</head>
<body>
<table class="table table-striped table-bordered">
  <thead style="text-align: center;color: black; font-size: 20px;">
       <tr>
          <td colspan="6">我的评价记录</td>
       </tr>
       <tr>
           <td>ID</td>
	       <td>文字评价</td>
	       <td>晒图评价</td>
	       <td>星级评价</td>
	       <td>评价时间</td>
    
           <td>商家名</td>
       </tr>
  </thead>
  <tbody>
    <c:forEach items="${evalist }" var="eva" >
       <tr>
	      <td>${eva.evaluateid }</td>
	      <td>${eva.evaluatecontent}</td>
	      <td>
			<c:if test="${eva.evaluatepic !=null}">
				<img src="img/${eva.evaluatepic }" width=100 height=100/><br/>						
			</c:if>
		  </td>	
          <td>
          <div id="${eva.evaluateid}" >
          
          
          </div>
  
  
	      <script type="text/javascript">
	
	        $(function(){
		   
		     $("#${eva.evaluateid}").raty({
			   path:"img",
			   starOn:"stars2.png",
			   starOff:"stark2.png",
			   size:100,
			   score:${eva.evaluatestar}			  
		   })	 	   		   
	   });	     	
          </script>
         </td>
				
	      <td>
	         <fmt:formatDate value="${eva.evaluatetime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	      </td>
         
      
         <td>煲仔饭</td>
      
           
      </c:forEach>
     
     
      </tbody>
     </table>
  
</body>
</html>
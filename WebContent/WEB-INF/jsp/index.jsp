<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园外卖在线支付</title>
  <link rel="stylesheet" href="static/jquery-ui.min.css">
  <link rel="shortcut icon" href="img/icon.png">
  <script src="static/jquery-1.11.2.min.js"></script>
  <script src="static/jquery-ui.min.js"></script>
  <script src="static/demo.js"></script>
  <script>
  	$(function() {
	    setApiDemoTabs("#tabs-purchase");
	    setApiDemoTabs("#tabs-preauth");
	  });
  </script>
  <link rel="stylesheet" href="static/demo.css">
</head>

<body style="background-color:#e5eecc;">
<div id="wrapper">
<div id="header">
<h2>校园外卖在线支付</h2>

</div>

<div id="tabs-api">
  <ul>
    <li><a href="#tabs-api-1">前言</a></li>
    <li><a href="#tabs-api-2">消费栏</a></li>
    <li><a href="#tabs-api-4">预授权</a></li>
    <li><a href="#tabs-api-3">常见问题</a></li>
  </ul>
  
  <div id="tabs-api-1">
    <jsp:include  page="/WEB-INF/jsp/pages/introduction.jsp"/>
  </div>

  <div id="tabs-api-2">
	<div id="tabs-purchase">
	  <ul>
	    <li><a href="#tabs-purchase-1">说明</a></li>
	    <li><a href="${pageContext.request.contextPath }/reallypay.action?pic=${price}">消费</a></li>
	    <li><a href="${pageContext.request.contextPath }/backpay.action">消费撤销</a></li>
	    <li><a href="${pageContext.request.contextPath }/refund.action">退货</a></li>
		<li><a href="${pageContext.request.contextPath }/query.action">交易状态查询</a></li>
		<li><a href="${pageContext.request.contextPath }/filetransfer.action">对账文件下载</a></li>
	  </ul>
	  <div id="tabs-purchase-1">
	     <jsp:include  page="/WEB-INF/jsp/pages/consume_intro.jsp"/>
	  </div>
	</div>
  </div>

  <div id="tabs-api-4">
	<div id="tabs-preauth">
	  <ul>
	    <li><a href="#tabs-preauth-1">说明</a></li>
	    <li><a href="pages/preauth.jsp">预授权</a></li>
	    <li><a href="pages/preauthFinish.jsp">预授权完成</a></li>
	    <li><a href="pages/preauthUndo.jsp">预授权撤销</a></li>
	    <li><a href="pages/preauthFinishUndo.jsp">预授权完成撤销</a></li>
		<li><a href="pages/query.jsp">交易状态查询</a></li>
		<li><a href="pages/file_transfer.jsp">对账文件下载</a></li>
	  </ul>
	  <div id="tabs-preauth-1">
	     <jsp:include  page="/WEB-INF/jsp/pages/preauth_intro.jsp"/>
	  </div>
	</div>
  </div>

  <div id="tabs-api-3">
    <jsp:include  page="/WEB-INF/jsp/pages/devlopHelp.jsp"/>
  </div>
	  
  </div> <!-- end of tabs-api-->
</div><!-- end of wrapper-->
 
 
</body>
</html>
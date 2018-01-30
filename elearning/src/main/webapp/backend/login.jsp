<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>backend/login/css/normalize.css" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>backend/login/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>backend/login/css/component.css" />
<jsp:include page="common/link.jsp" />

</head>

<body>
	<div class=" demo-1">
		<div class="content">
			<div id="large-header" class="large-header">
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box">
					<h3>欢迎进入竞技场后端管理</h3>
					<form action="" name="f"
						method="post">
						<div class="input_outer">
							<span class="u_user"></span> <input name="logname" class="text"
								style="color: #FFFFFF !important" type="text"
								placeholder="请输入账户">
						</div>
						<span>${mess }</span>
						<div class="input_outer">
							<span class="us_uer"></span> <input name="logpass" class="text"
								style="color: #FFFFFF !important; position:absolute; z-index:100;"
								value="" type="password" placeholder="请输入密码">
						</div>
						<div class="input_outer">
							<input type="radio">abc <input type="radio">abc <input
								type="radio">abc <input type="radio">abc
						</div>
						<div class="mb2">
							<a class="act-but submit" href="<%=basePath%>backend/adminLogin"
								style="color: #FFFFFF">登录</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<script src="<%=basePath%>backend/login/js/TweenLite.min.js"></script>
	<script src="<%=basePath%>backend/login/js/EasePack.min.js"></script>
	<script src="<%=basePath%>backend/login/js/rAF.js"></script>
	<script src="<%=basePath%>backend/login/js/demo-1.js"></script>
	<div style="text-align:center;"></div>
	
	<!-- 模态框 -->
	<div id="messDialog" class="modal fade" style="z-index: 9999"
		tabindex="-1">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">登录消息提示</h4>
				</div>
				<div class="modal-body">
					<p></p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
		</div>
	</div>
	
</body>
<script type="text/javascript">
		$(function() {
			
		});
	</script>
</html>
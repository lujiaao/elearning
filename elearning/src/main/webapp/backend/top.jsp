<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String appPath =request.getServletContext().getContextPath();
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 导入公共样式 -->
<jsp:include page="common/link.jsp"/>
<!-- 该页面特有的样式 -->

<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/theme.css">
<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/premium.css">

<title>Insert title here</title>
</head>
<body class="theme-blue">
	<!--这是顶部的样式-->
		<style type="text/css">
			.navbar-default .navbar-brand,
			.navbar-default .navbar-brand:hover {
				color: #fff;
			}
		</style>

		<!--这个部分是导航条-->
		<div class="navbar navbar-default" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="" href="index.html"><span class="navbar-brand"><span class="fa fa-paper-plane"></span>竞技场后端管理</span></a></div>

			<div class="navbar-collapse collapse" style="height: 1px;">
				<ul id="main-menu" class="nav navbar-nav navbar-right">
					<li class="dropdown hidden-xs">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<span class="glyphicon glyphicon-user padding-right-small" style="position:relative;top: 3px;"></span> 这里是用户名
							<i class="fa fa-caret-down"></i>
						</a>

						<ul class="dropdown-menu">
							<li><a href="./">更改密码</a></li>
							<li class="divider"></li>
							<li class="dropdown-header">Admin Panel</li>
							<li><a href="./">Users</a></li>
							<li><a href="./">Security</a></li>
							<li><a tabindex="-1" href="./">Payments</a></li>
							<li class="divider"></li>
							<li><a tabindex="-1" href="sign-in.html">Logout</a></li>
						</ul>
					</li>
				</ul>

			</div>
		</div>
</body>
</html>
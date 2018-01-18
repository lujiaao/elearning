<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 引入b3框架的CSS样式和JS代码 -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>bootstrap/css/bootstrap.css" />
<script type="text/javascript" src="<%=basePath%>bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="<%=basePath %>bootstrap/js/bootstrap.min.js"></script>

<!-- 引入图标字体库  -->
<link rel="stylesheet" type="text/css" href="<%=basePath %>font-awesome/css/font-awesome.min.css" />

<!-- 引入Jquery代码  -->
<script type="text/javascript" src="<%=basePath %>jquery/jquery-1.11.1.min.js"></script>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
String appPath =request.getServletContext().getContextPath();
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!--  -->
<jsp:include page="common/link.jsp"></jsp:include>

<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/theme.css">
<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/premium.css">


<title>Insert title here</title>
</head>
<body class="theme-blue">
	<!--这是左边菜单栏部分-->
		<div class="sidebar-nav">
			<ul>
				<li><a href="#" data-target=".dashboard-menu" class="nav-header" data-toggle="collapse"><i class="fa fa-fw fa-dashboard"></i>用户模块<i class="fa fa-collapse"></i></a></li>
				<li>
					<ul class="dashboard-menu nav nav-list collapse in">
						<li><a href="<%=appPath%>/backend/userFindByAll" target="mainFx"><span class="fa fa-caret-right"></span> 用户列表</a></li>
						<li><a href="<%=appPath%>/backend/department/main.jsp" target="mainFx"><span class="fa fa-caret-right"></span> 显示树</a></li>
						<li><a href="<%=appPath%>/backend/user/role/role_main.jsp" target="mainFx"><span class="fa fa-caret-right"></span> 修改用户</a></li>
						<li><a href="<%=appPath%>/ManagerServlet?action=listManagerByPagenum" target="mainFx"><span class="fa fa-caret-right"></span> 查找用户</a></li>
		<!-- 第五小组 -->
						<!-- 角色管理 -->
						<li><a href="<%=appPath%>/backend/getByAll?pageNum=1" target="mainFx"><span class="fa fa-caret-right"></span> 角色管理</a></li>
						<!-- 岗位管理 -->
						<li><a href="<%=appPath%>/backend/user/post/post_main.jsp" target="mainFx"><span class="fa fa-caret-right"></span> 岗位管理</a></li>
					</ul>
				</li>
				
				<li><a href="#" data-target=".accounts-menu1" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-briefcase"></i>课程模块<i class="fa fa-collapse"></i></a></li>
				<li>
					<ul class="accounts-menu1 nav nav-list collapse">
						<li><a href="<%=appPath%>/backend/course/course_main.jsp" target="mainFx"><span class="fa fa-caret-right"></span>所有课程</a></li>
						<li><a href="<%=appPath%>/AnnoServlet?action=toSave"><span class="fa fa-caret-right"></span>增加公告</a></li>
						<li><a href="/UGShop/Manage/annoSearch.jsp"><span class="fa fa-caret-right"></span>查找公告</a></li>
					</ul>
				</li>

				<!--<li data-popover="true" data-content="Items in this group require a <strong><a href='http://portnine.com/bootstrap-themes/aircraft' target='blank'>premium license</a><strong>." rel="popover" data-placement="right"><a href="#" data-target=".premium-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-fighter-jet"></i> Premium Features<i class="fa fa-collapse"></i></a></li>-->
				<li data-popover="true" rel="popover" data-placement="right"><a href="#" data-target=".premium-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-fighter-jet"></i>订单模块<i class="fa fa-collapse"></i></a></li>
				<li>
					<ul class="premium-menu nav nav-list collapse">
						<li><a href=""><span class="fa fa-caret-right"></span>添加订单</a></span></li>
						<li><a href="#"><span class="fa fa-caret-right"></span>删除订单</a></li>
						<li><a href="premium-blog.html"><span class="fa fa-caret-right"></span>修改订单</a></li>
						<li><a href="premium-blog-item.html"><span class="fa fa-caret-right"></span>查找订单</a></li>
						<li><a href="premium-pricing-tables.html"><span class="fa fa-caret-right"></span> Pricing Tables</a></li>
					</ul>
				</li>
				

				<!--<li><a href="#" data-target=".accounts-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-briefcase"></i> Account <span class="label label-info">+3</span></a></li>-->
				<li><a href="#" data-target=".accounts-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-briefcase"></i>公告模块<i class="fa fa-collapse"></i></a></li>
				<li>
					<ul class="accounts-menu nav nav-list collapse">
						<li><a href="<%=appPath%>/AnnoServlet?action=selectAllAnnouncement"><span class="fa fa-caret-right"></span>所有公告</a></li>
						<li><a href="<%=appPath%>/AnnoServlet?action=toSave"><span class="fa fa-caret-right"></span>增加公告</a></li>
						<li><a href="/UGShop/Manage/annoSearch.jsp"><span class="fa fa-caret-right"></span>查找公告</a></li>
					</ul>
				</li>

				<li><a href="#" data-target=".legal-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i>基础数据管理<i class="fa fa-collapse"></i></a></li>
				<li>
					<ul class="legal-menu nav nav-list collapse">
						<li><a href="category/category_main.jsp" target="mainFx"><span class="fa fa-caret-right"></span>目录管理</a></li>
						<li><a href="ProductServlet?action=getProduct&pageNum=1"><span class="fa fa-caret-right"></span>商品管理</a></li>
						<li><a href="ProductServlet?action=getProduct&pageNum=1"><span class="fa fa-caret-right"></span>風格管理</a></li>
					</ul>
				</li>
			</ul>
		</div>
</body>
</html>

	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
		});
	</script>
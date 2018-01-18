<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String appPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 导入公共样式 -->
<jsp:include page="../../common/link.jsp"/>
<!-- 该页面特有的样式 -->
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/theme.css">
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/premium.css">
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/role.css" />
</head>

<body>
	<div class="container-fluid">
		<div class="top">
			<div class="col-md-10">
				角色名称 <input class="form-inline" type="text" name="roleName"
					id="roleName"> <input class="btn btn-success role-btn"
					type="button" value="查询" />
			</div>
			<div  class="col-md-2 acol-role"><a href="">新增角色</a></div>
		</div>

		<table
			class="table-role table table-striped table-bordered table-hover table-condensed">
			<thead>
				<tr class="tr-top">
					<th>角色名称</th>
					<th>角色编号</th>
					<th>角色类型</th>
					<th>显示顺序</th>
					<th>是否可用？</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr class="tr-role">
					<td width="15%">111</td>
					<td width="28%">111</td>
					<td width="17%">111</td>
					<td width="7%">11</td>
					<td width="7%">
					<input class="btn btn-success role-btn"
					type="button" value="启用" /></td>
					<td width="16%">
					<input class="btn btn-success role-btn"
					type="button" value="角色授予用户列表" /></td>
					</td>
				</tr>
			</tbody>
		</table>
		
		<div class="foot">
		<div class="col-md-10 acol-role-left"><span>总记录数:<span>总记录数</span></span></div>
		<div class="col-md-2 acol-role"><span><span>当前页数</span>/<span>总页数</span></span></div>
		</div>
	</div>
</body>
</html>
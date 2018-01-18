<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String appPath = request.getContextPath();
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 导入公共样式 -->
<jsp:include page="../common/link.jsp"/>
<!-- 该页面特有的样式 -->
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/theme.css">
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/premium.css">
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/role.css" />
</head>
<body>

	<form class="form-inline">
		<div class="dropdown">
			<button class="btn btn-default dropdown-toggle" type="button"
				id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="true">
				Dropdown <span class="caret"></span>
			</button>
			<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
				<li><a href="#">Action</a></li>
				<li><a href="#">Another action</a></li>
				<li><a href="#">Something else here</a></li>
				<li role="separator" class="divider"></li>
				<li><a href="#">Separated link</a></li>
			</ul>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail2">Email</label> <input type="email"
				class="form-control" id="exampleInputEmail2"
				placeholder="jane.doe@example.com">
		</div>
		<button type="submit" class="btn btn-default">Send invitation</button>
	</form>
	<table
		class="table-role table table-striped table-bordered table-hover table-condensed">
		<thead>
			<tr class="tr-top">
				<th>id</th>
				<th>用户昵称</th>
				<th>邮箱</th>
				<th>用户名</th>
				<th>电话</th>
				<th>性别</th>
				<th>注册时间</th>
				<th>所属部门</th>
				<th>用户类型</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.uacUserAll}" var="uacUser">
				<tr class="tr-role">
					<td>${uacUser.id }</td>
					<td>${uacUser.account }</td>
					<td>${uacUser.email }</td>
					<td>${uacUser.username }</td>
					<td>${uacUser.phone }</td>
					<td><c:choose>
							<c:when test="${uacUser.gender eq 1}">男</c:when>
							<c:when test="${uacUser.gender eq 0}">女</c:when>
							<c:otherwise>null</c:otherwise>
						</c:choose></td>
					<td>${uacUser.regTime }</td>
					<td>${uacUser.sysDepartment }</td>
					<td>${uacUser.userType }</td>
					<td><a href="<%=appPath%>/backend/editUacUserAfter?id=${uacUser.id}" class="btn btn-primary"> <i
							class="fa fa-edit"></i>&nbsp;修改
					</a> &nbsp;&nbsp;
						<button class="del-btn btn btn-primary">
							<i class="fa fa-remove"></i>&nbsp;删除
						</button></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
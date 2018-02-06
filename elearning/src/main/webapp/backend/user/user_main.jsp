<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String appPath = request.getContextPath();
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>

		<!-- 导入公共样式 -->
		<jsp:include page="../common/link.jsp" />
		<!-- 该页面特有的样式 -->
		<link rel="stylesheet" type="text/css" href="<%=appPath%>/backend/css/theme.css">
		<link rel="stylesheet" type="text/css" href="<%=appPath%>/backend/css/premium.css">
		<link rel="stylesheet" type="text/css" href="<%=appPath%>/backend/css/role.css" />

		<link rel="stylesheet" type="text/css" href="<%=appPath%>/backend/css/user_main.css" />
		<script src="<%=appPath%>/backend/js/user/user_main.js "></script>

	</head>

	<body>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-body">
				<a href="<%=appPath%>/backend/userAddBefore" class="btn btn-primary">添加用户</a>
			</div>

			<!-- Table -->
			<table class="table-role table table-striped table-bordered table-hover table-condensed my-user-table">
				<thead>
					<tr class="tr-top">
						<th>id</th>
						<th>账号</th>
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
							<td>
								<c:choose>
									<c:when test="${uacUser.gender eq 1}">男</c:when>
									<c:when test="${uacUser.gender eq 0}">女</c:when>
									<c:otherwise>null</c:otherwise>
								</c:choose>
							</td>

							<td>
								<fmt:parseDate value="${uacUser.regTime }" var="dateType" pattern="yyyy-MM-dd" />
								<fmt:formatDate value="${dateType}" pattern="yyyy-MM-dd" />
							</td>
							<td>${uacUser.sysDepartment.depttName }</td>
							<td>${uacUser.userType }</td>
							<td>
								<a href="<%=appPath%>/backend/userEditBefore?id=${uacUser.id}" class="btn btn-primary"> <i class="fa fa-edit"></i>&nbsp;修改
								</a> &nbsp;&nbsp;
								<button class="del-btn btn btn-primary" data-id="${uacUser.id}" data-account="${uacUser.account}">
							<i class="fa fa-remove"></i>&nbsp;删除
						</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div id="del-modal" class="modal fade" tabindex="-1" role="dialog">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title">删除提示</h4>
					</div>
					<div class="modal-body">
						<h3 class="message"></h3>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary ok-btn">确定删除</button>
					</div>
				</div>
			</div>
		</div>

	</body>

</html>
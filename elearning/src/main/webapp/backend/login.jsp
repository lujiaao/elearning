<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,cn.uc.ele.dto.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			
	List<UacRoleDto> roleList = (List<UacRoleDto>) request.getAttribute("adminRoles");
	if (roleList == null || roleList.isEmpty()) {
		response.sendRedirect(basePath + "backend/loginBefore");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>竞技场-管理员登录</title>

<jsp:include page="common/link.jsp"></jsp:include>
<script type="text/javascript" src="<%=basePath%>backend/js/cookie.js"></script>
<style>
body {
	background: lightgray;
}

.load_pro {
	margin-top: 250px;
}

.load_pro .modal-body {
	padding: 0;
}

.load_pro .progress {
	margin-bottom: 0;
}

.login_box {
	margin: 150px auto;
}

.login_box .panel-body {
	padding: 20px;
}

#tip_tv {
	color: red;
}
</style>

</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6  col-md-offset-3">
				<div class="panel panel-primary login_box">
					<div class="panel-heading">
						<h3 class="text-center">《竞技场》后台管理系统V-1.1</h3>
					</div>
					<div class="panel-body">
						<form class="form-horizontal"
							action="/elearning/backend/adminLogin" method="post">
							<div class="form-group">
								<label for="username" class="col-sm-2 control-label">账号</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="account"
										name="account" placeholder="请输入账号" autocomplete="off">
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input type="password" class="form-control" id="password"
										name="password" placeholder="请输入密码">
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="col-sm-2 control-label">角色</label>
								<div class="col-sm-10">
									<c:forEach items="${adminRoles}" var="role" varStatus="status">
										<c:choose>
											<c:when test="${status.first}">
												<label class="radio-inline"> <input type="radio"
													name=roleId checked value="${role.id}">${role.roleName }
												</label>
											</c:when>
											<c:otherwise>
												<label class="radio-inline"> <input type="radio"
													name="roleId" value="${role.id}">${role.roleName }
												</label>
											</c:otherwise>
										</c:choose>


									</c:forEach>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-3 col-sm-offset-2">
									<button type="submit" class="btn btn-sm btn-primary">登录</button>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-offset-3 control-label" id="tip_tv">
								  ${mess}</label>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</html>
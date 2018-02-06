<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String appPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 导入公共样式 -->
<jsp:include page="../../common/link.jsp" />
<!-- 该页面特有的样式 -->
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/theme.css">
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/premium.css">
<link rel="stylesheet" type="text/css"
	href="<%=appPath%>/backend/css/role.css" />

<style type="text/css">
.role-btn {
	height: 25px;
	padding-top: 0 !important;
	padding-bottom: 0 !important;
	text-align: center;
}

.my-acol {
	padding: 0;
}

.my-pageLimit {
	margin: 12px 0 8px 0;
}

.role-label, .role-input {
	padding: 0;
	margin: 0;
	background-color: #ffffff;
}

.role-label {
	text-align: right;
	line-height: 34px;
}

.input-radio {
	height: 34px;
	line-height: 34px;
}
</style>
</head>

<body>
	<div class="container-fluid">
		<div class="top">
			<div class="col-md-10">
				角色名称 <input class="form-inline" type="text" name="roleName"
					id="roleName"> <input class="btn btn-success role-btn"
					type="button" value="查询" />
			</div>
			<div class="col-md-2 acol-role">
				<a id="add_role">新增角色</a>
			</div>
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
				<c:forEach items="${roles }" var="role">
					<tr class="tr-role">
						<td width="15%">${role.roleName }</td>
						<td width="28%">${role.roleCode }</td>
						<td width="17%">${role.roleType }</td>
						<td width="7%">${role.disSeq }</td>
						<c:choose>
							<c:when test="${role.isDeactive eq false}">
								<td width="5%"><input
									class="btn btn-bg btn-danger role-btn" type="button" value="禁用" /></td>
							</c:when>
							<c:when test="${role.isDeactive eq true}">
								<td width="2%"><input class="btn btn-success role-btn"
									type="button" value="启用" /></td>
							</c:when>
						</c:choose>

						<td width="13%">
							<div class="btn-group dropup">
								<button type="button" class="btn btn-default role-btn">角色授予用户列表</button>
								<button type="button"
									class="btn btn-default dropdown-toggle role-btn"
									data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false">
									<span class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li><a href="#">角色授权</a></li>
									<li><a href="#">编辑</a></li>
									<li><a class="del-btn"
										data-id="${role.id}" data-roleName="${role.roleName}">删除</a></li>
								</ul>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="foot">
			<div class="col-md-2 acol-role-left">
				<span>总记录数：<span>${count }</span></span>

			</div>
			<div class="col-md-8 my-acol">
				<div id="pageDiv" style="text-align:center;height: 57px;">
					<ul id="pageLimit"></ul>
				</div>
			</div>
			<div class="col-md-2 acol-role">
				<span><span>当前页/总页数：${pageNum }</span>/<span>${pages }</span></span>
			</div>
		</div>
	</div>

	<!--添加角色模态框-->
	<div id="add_role_modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title"></h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" action="<%=appPath%>/backend/addRole" method="post">
						<div class="form-group text-right">
							<label class="col-xs-4 role-label">角色名称：</label>
							<div class="col-xs-5 role-input">
								<input type="text" name="roleName" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-4 role-label">角色类型：</label>
							<div class="col-xs-6 role-input input-radio">
								<input type="radio" name="roleType" value="后台管理员角色">后台管理员角色
								<input type="radio" name="roleType" checked="checked"
									value="前台普通用户角色">前台普通用户角色
							</div>
						</div>
						<div class="form-group">
							<label class="col-xs-4 role-label">显示顺序：</label>
							<div class="col-xs-5 role-input">
								<input type="text" name="disSeq" class="form-control" />
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary"
								data-dismiss="modal">取消</button>
							<button type="submit" class="btn btn-primary add-btn">确认</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--删除角色模态框-->
	<div id="del-modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
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

<script src="<%=appPath%>/backend/js/user/role_main.js"></script>
<script src="<%=appPath%>/js/bootstrap-paginator.min.js"></script>

<script>
	$(function() {
		/* 添加角色 */
		$(function() {
			$('#add_role').click(function() {
				$('#add_role_modal').modal('show');
			});
		});

		/* 删除角色 */
		$(function() {
			$('.del-btn').click(function() {
				var id = $(this).data('id');
				var roleName = $(this).data('roleName');
				$('#del-modal .modal-body .message').text("确定要删除" + roleName + "用户吗!");
				$('#del-modal .modal-footer .ok-btn').data("id", id);
				$('#del-modal').modal('show');
			});
			$('#del-modal .modal-footer .ok-btn').click(function() {
				window.location.href = '<%=appPath%>/backend/delRole?id=' + $(this).data('id');
			});
		})

		//分页初始化
		//	分页前端脚本
		$('#pageLimit').bootstrapPaginator({
			currentPage : "${pageNum}", //当前的请求页面。
			totalPages : "${pages}", //一共多少页。
			size : "normal", //应该是页眉的大小。
			bootstrapMajorVersion : 3, //bootstrap的版本要求。
			alignment : "right",
			numberOfPages : "${pageSize}", //一页列出多少数据。
			itemTexts : function(type, page, current) { //如下的代码是将页眉显示的中文显示我们自定义的中文。
				switch (type) {
				case "first":
					return "首页";
				case "prev":
					return "上一页";
				case "next":
					return "下一页";
				case "last":
					return "末页";
				case "page":
					return page;
				}
			},
			onPageClicked : function(event, originalEvent, type, page) { //给每个页眉绑定一个事件，其实就是ajax请求，其中page变量为当前点击的页上的数字。
				window.location = "<%=appPath%>/backend/getByAll?pageNum=" + page;
			}
		});
		$('#pageLimit').addClass("my-pageLimit");
	});
</script>

</html>
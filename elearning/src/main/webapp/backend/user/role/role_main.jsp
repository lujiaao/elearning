<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String appPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				<a href="">新增角色</a>
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
				<c:forEach items="${requestScope.roles }" var="role">
					<tr class="tr-role">
						<td width="15%">${role.roleName }</td>
						<td width="28%">${role.roleCode }</td>
						<td width="17%">${role.roleType }</td>
						<td width="7%">${role.disSeq }</td>
						<c:choose>
							<c:when test="${role.isDeactive eq false}">
								<td width="2%"><input
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
									<li><a href="#">删除</a></li>
								</ul>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="foot">
			<div class="col-md-10 acol-role-left">
				<span>总记录数:<span>总记录数</span></span>
			</div>
			<!--分页区域-->
			<!-- <div class="panel-footer"> -->
				<!--分页界面-->
				<div id="pageDiv" style="text-align: center;border:1px solid #000;">
					<ul id="pageLimit"></ul>
				</div>
			<!-- </div> -->
			<div class="col-md-2 acol-role">
				<span><span>当前页数</span>/<span>总页数</span></span>
			</div>
		</div>
	</div>

	<div class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Modal title</h4>
				</div>
				<div class="modal-body">
					<p>One fine body&hellip;</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
</body>

<script>
	
	//分页初始化
	//	分页前端脚本
    $('#pageLimit').bootstrapPaginator({
        currentPage: ${pageInfo.pageNum},//当前的请求页面。
        totalPages: ${pageInfo.pages},//一共多少页。
        size: "normal",//应该是页眉的大小。
        bootstrapMajorVersion: 3,//bootstrap的版本要求。
        alignment: "right",
        numberOfPages:${pageInfo.pageSize},//一页列出多少数据。
        itemTexts: function (type, page, current) {//如下的代码是将页眉显示的中文显示我们自定义的中文。
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
        onPageClicked: function (event, originalEvent, type, page) {//给每个页眉绑定一个事件，其实就是ajax请求，其中page变量为当前点击的页上的数字。

        window.location = "<%=appPath%>system/NewsServlet.action?method=select&currentPage="+page;

        }
    });
</script>

</html>
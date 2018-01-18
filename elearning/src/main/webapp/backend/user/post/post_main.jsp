<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String appPath = request.getContextPath();
 %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

<!-- 导入公共样式 -->
<jsp:include page="../../common/link.jsp"/>
<!-- 该页面特有的样式 -->
<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/theme.css">
<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/premium.css">
<title>Insert title here</title>
</head>
<!-- 陈玉华：负责岗位管理主界面的设计 -->
<body>
			<div class="col-sm-12">
				<div class="panle panel-danger">
					<div class="panel-heading">
<div class="btn-group">
	   <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
		---------所有分类---------&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="caret"></span>
	   </button>
	   <ul class="dropdown-menu" role="menu">
		<li><a href="#">werwewerwerrwwrwrw</a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
	   </ul>
</div>
<input  type="text" name="navsearch" id="navsearch" placeholder="岗位名称/岗位编号"/>
	<div class="btn-group">
		<button type="button" class="btn btn-danger">搜索</button>
	</div>
	<button type="button" class="btn btn-default btn-sm" style="float: right;">
          <span class="glyphicon glyphicon-paperclip"></span> 导入岗位
        </button>
	<button type="button" class="btn btn-default btn-sm" style="float: right;">
    <span class="glyphicon glyphicon-user"></span>
    新增岗位
</button>

					</div>
					<div class="panel-body">
						<table class="table table-striped table-hover">
							<thead>
								<tr>
									<th>岗位名称</th>
									<th>岗位编号</th>
									<th>所属分类</th>
									<th>所属部门</th>
									<th>显示顺序</th>
									<th>是否可用？</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>设计师</td>
									<td>201552601</td>
									<td></td>
									<td></td>
									<td>2</td>
									<td><div class="btn-group">
		<button type="button" class="btn btn-info">启用</button>
	</div></td>

									<td><div class="btn-group">
	   <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
		设置岗位需达到的能力素质模型&nbsp;<span class="caret"></span>
	   </button>
	   <ul class="dropdown-menu" role="menu">
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
	   </ul>
</div></td>
								</tr>

								<tr>
									<td>电商</td>
									<td>DS</td>
									<td></td>
									<td></td>
									<td>2</td>
									<td><div class="btn-group">
		<button type="button" class="btn btn-info">启用</button>
	</div></td>

																		<td><div class="btn-group">
	   <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
		设置岗位需达到的能力素质模型&nbsp;<span class="caret"></span>
	   </button>
	   <ul class="dropdown-menu" role="menu">
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
	   </ul>
</div></td>	
								</tr>

								<tr>

									<td>web前端讲师</td>

									<td>webqd</td>

									<td></td>

									<td></td>

									<td>3</td>

									<td><div class="btn-group">
		<button type="button" class="btn btn-info">启用</button>
	</div></td>

																		<td><div class="btn-group">
	   <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
		设置岗位需达到的能力素质模型&nbsp;<span class="caret"></span>
	   </button>
	   <ul class="dropdown-menu" role="menu">
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
	   </ul>
</div></td>	
								</tr>
								<tr>

									<td>IT运维</td>

									<td>IT</td>

									<td></td>

									<td></td>

									<td>1</td>

									<td><div class="btn-group">
		<button type="button" class="btn btn-info">启用</button>
	</div></td>

							                   <td><div class="btn-group">
	   <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
		设置岗位需达到的能力素质模型&nbsp;<span class="caret"></span>
	   </button>
	   <ul class="dropdown-menu" role="menu">
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
	   </ul>
</div></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总记录数：4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1/1</p>




</body>
</html>
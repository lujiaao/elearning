<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
  
    <form class="form-horizontal" action="<%=basePath%>backend/" method="post">
		<div class="form-group">
			<label class="col-xs-4 control-label">登录名：</label>
			<div class="col-xs-4">
				<input type="text" name="account" class="form-control"
					placeholder="登录名称">
			</div>
		</div>
		<div class="form-group">
			<label class="col-xs-4 control-label">用户名：</label>
			<div class="col-xs-4">
				<input type="text" name="username" class="form-control"
					placeholder="用户名称">
			</div>
		</div>

		<div class="form-group">
			<label class="col-xs-4 control-label">邮箱：</label>
			<div class="col-xs-4">
				<input type="email" name="email" class="form-control"
					placeholder="邮箱号">
			</div>
		</div>
		<div class="form-group">
			<label class="col-xs-4 control-label">电话号码：</label>
			<div class="col-xs-4">
				<input type="text" name="phone" class="form-control"
					placeholder="手机号">
			</div>
		</div>
		<div class="form-group">
			<label class="col-xs-4 control-label">性别：</label>
			<div class="col-xs-4">
				<label class="radio-inline"> <input type="radio"
					name="gender" id="" value="1"> 男
				</label> <label class="radio-inline"> <input type="radio"
					name="gender" id="" value="0"> 女
				</label>
			</div>
		</div>
		<div class="form-group">
			<label class="col-xs-4 control-label">所属部门</label>
			<div class="col-xs-4">
				<select name="deptName" class="form-control">
					<option value="">1</option>
					<option value="">2</option>
					<option value="">3</option>
					<option value="">4</option>
					<option value="">5</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-xs-4 control-label">用户角色</label>
			<div class="col-xs-4">
				<select name="deptName" class="form-control">
					<option value="">1</option>
					<option value="">2</option>
					<option value="">3</option>
					<option value="">4</option>
					<option value="">5</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-offset-7 col-xs-5">
				<button type="submit" class="btn btn-default">提交修改</button>
			</div>
		</div>
	</form>
  </body>
</html>

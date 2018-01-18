<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>课程管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- 导入公共样式 -->
	<jsp:include page="../common/link.jsp" />
	<!-- 该页面特有的样式 -->
	<link rel="StyleSheet" href="<%=path %>/backend/dtree/dtree.css" type="text/css" />
	<script type="text/javascript" src="<%=path %>/backend/dtree/dtree.js"></script>
	<style>
		.left_border_div{
			border-left:1px solid gray;
			height:100%;
		}
		
		.menu_bar{
			padding-top:10px;
			height:50px;
		}
	</style>

  </head>
  
  <body>
   	<div class="container">
   		<div class="row">
   			<div class="col-md-3">
   				<!-- 部门树放这里 -->
   				<p><a href="javascript: d.openAll();">全部打开</a> | <a href="javascript: d.closeAll();">全部收起</a></p>
   				<div class="dtree" id="dtree">					
					
				
				</div>
   			</div>
   			<div class="col-md-9  left_border_div">
   				<div class="row menu_bar">
   					<div class="col-md-10">
   						当前的部门：<span id="curDepartName" ></span>
   					</div>
   					<div class="col-md-2">
   						<button id="btnAdd" type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal" >添加部门</button>
   						
   					</div>
   				</div>
   				<!-- 部门列表放在 -->
   				<table class="table table-bordered">
   					<thead>
   						<tr>
   							<td>id</td>
   							<td>名称</td>
   							<td>编码</td>
   							<td>描述</td>
   							<td>操作</td>
   						</tr>
   					</thead>
   					<tbody id="deptTabBody">
   						<tr>
   							<td>1</td>
   							<td>研发部</td>
   							<td>0001</td>
   							<td>描述</td>
   						</tr>
   						<tr>
   							<td>2</td>
   							<td>研发部</td>
   							<td>0001</td>
   							<td>描述</td>
   						</tr>
   						<tr>
   							<td>3</td>
   							<td>研发部</td>
   							<td>0001</td>
   							<td>描述</td>
   						</tr>
   					</tbody>
				</table>
   			</div>
   		</div>
   	</div>
   	
   	
   	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">添加部门</h4>
	      </div>
	      <div class="modal-body">
	        <form>
	        	<input type="hidden"  id="deptId">
	           <div class="form-group">
			    <label for="deptName">部门名称</label>
			    <input type="text" class="form-control" id="deptName" placeholder="部门名称">
			  </div>
			  <div class="form-group">
			    <label for="deptCode">部门编码</label>
			    <input type="text" class="form-control" id="deptCode" placeholder="部门编码">
			  </div>
			  <div class="form-group">
			    <label for="deptNote">部门说明</label>
			    <input type="text" class="form-control" id="deptNote" placeholder="部门说明">
			  </div>
	        </form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" id="btnAddSave" class="btn btn-primary">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
	
  </body>
</html>

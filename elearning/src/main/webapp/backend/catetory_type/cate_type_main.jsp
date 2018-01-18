<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>分类类型管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入公共样式、JS -->
	<jsp:include page="../common/link.jsp"/>
  </head>
  
  <body>
   	<div class="container">
   		<div class="row">
   				<!-- 类型分类 -->
   				<table class="table table-bordered">
   					<thead>
   						<tr>
   							<td>id</td>
   							<td>分类名称</td>
   							<td>编码</td>
   							<td>分类描述</td>
   							<td>排序</td>
   							<td>操作</td>
   						</tr>
   					</thead>
   					<tbody id="dataTabBody">
   						<tr>
   							<td>1</td>
   							<td>研发部</td>
   							<td>0001</td>
   							<td>1</td>
   							<td>描述</td>
   						</tr>
   						<tr>
   							<td>2</td>
   							<td>研发部</td>
   							<td>0001</td>
   							<td>1</td>
   							<td>描述</td>
   						</tr>
   						<tr>
   							<td>3</td>
   							<td>研发部</td>
   							<td>0001</td>
   							<td>1</td>
   							<td>描述</td>
   						</tr>
   					</tbody>
				</table>
   			</div>
   	</div>
   	
   	
   	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">添加分类</h4>
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
	<!-- 编辑部门 -->
	<div class="modal fade" id="myModalEdit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">编辑分类</h4>
	      </div>
	      <div class="modal-body">
	        <form>
	           <div class="form-group">
			    <label for="deptName">部门名称</label>
			    <input type="text" class="form-control" id="deptName1" placeholder="部门名称">
			  </div>
			  <div class="form-group">
			    <label for="deptCode">部门编码</label>
			    <input type="text" class="form-control" id="deptCode1" placeholder="部门编码">
			  </div>
			  <div class="form-group">
			    <label for="deptNote">部门说明</label>
			    <input type="text" class="form-control" id="deptNote1" placeholder="部门说明">
			  </div>
	        </form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" id="btnUpdateSave" class="btn btn-primary">保存</button>
	      </div>
	    </div>
	  </div>
	</div>
	
  </body>
</html>

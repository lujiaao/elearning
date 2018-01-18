<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- 引入公共样式、JS -->
	<jsp:include page="../common/link.jsp"/>
	<script type="text/javascript" src="<%=path %>/backend/dtree/dtree.js"></script>
	<script type="text/javascript" src="<%=path%>/backend/js/category/category_main.js"></script>
	
	<link rel="StyleSheet" href="<%=path%>/backend/dtree/dtree.css" type="text/css" />
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
   				<!-- 目录树放这里 -->
   				<p><a href="javascript: d.openAll();">全部打开</a> | <a href="javascript: d.closeAll();">全部收起</a></p>
   				<div class="dtree" id="dtree">					
				
					<script type="text/javascript">
						
					</script>
				
				</div>
   			</div>
   			<div class="col-md-9  left_border_div">
   				<div class="row menu_bar">
   					<div class="col-md-10">
   						当前的分类：<span id="curCatName" ></span>
   					</div>
   					<div class="col-md-2">
   						<button id="btnAdd" type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal" >添加子分类</button>
   					</div>
   				</div>
   				
   				<!-- 部门列表放在 -->
   				<table class="table table-bordered">
   					<thead>
   						<tr>
   							<td>id</td>
   							<td width="30%">名称</td>
   							<td width="30%">编码</td>
   							<td>操作</td>
   						</tr>
   					</thead>
   					<tbody id="categoryTabBody">
   						
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
	        <h4 class="modal-title" id="myModalLabel">添加分类</h4>
	      </div>
	      <div class="modal-body">
	        <form>
	           <div class="form-group">
			    <label for="name">名称</label>
			    <input type="text" class="form-control" id="name" placeholder="名称">
			  </div>
			  <div class="form-group">
			    <label for="code">编码</label>
			    <input type="text" class="form-control" id="code" placeholder="编码">
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
	        <h4 class="modal-title" id="myModalLabel">编辑</h4>
	      </div>
	      <div class="modal-body">
	        <form>
	            <input type="hidden"  id="id">
	           <div class="form-group">
			    <label for="name1">名称</label>
			    <input type="text" class="form-control" id="name1" placeholder="名称">
			  </div>
			  <div class="form-group">
			    <label for="code1">编码</label>
			    <input type="text" class="form-control" id="code1" placeholder="编码">
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

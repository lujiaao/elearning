<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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

	<!-- 导入公共样式 -->
	<jsp:include page="../common/link.jsp" />
	<!-- 该页面特有的样式 -->
	<link rel="StyleSheet" href="<%=path%>/backend/dtree/dtree.css" type="text/css" />
	<script type="text/javascript" src="<%=path%>/backend/dtree/dtree.js"></script>
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
				<p>
					<a href="javascript: d.openAll();">全部打开</a> | <a
						href="javascript: d.closeAll();">全部收起</a>
				</p>
				<div class="dtree" id="dtree">

					<script type="text/javascript">
						d = new dTree('d');
					
						$(function() {
							//获取服务器端的部门列表，并显示
							$.getJSON("<%=path%>/backend/findDepartmentAll", function(data) {
								console.log(data.length);
								console.log(data);
					
								//显示部门树
					
								d.add(0, -1, '部门列表');
								for (var i = 0; i < data.length; i++) {
									if (data[i].parentId == null)
										d.add(data[i].id, 0, data[i].depttName, "javascript:listSubDept(" + data[i].id + ",'" + data[i].depttName + "')");
									else
										d.add(data[i].id, data[i].parentId, data[i].depttName, "javascript:listSubDept(" + data[i].id + ",'" + data[i].depttName + "')");
								}
								var str = d.toString();
					
								//document.write(d); 
								$("#dtree").append(str);
							});
					
					
					
						})
					
						function listSubDept(deptIdVal, parentDeptName) {
							if (parentDeptName != '')
								$("#curDepartName").html(parentDeptName);
							//保存当前部门的id,在添加子部门时候需要使用。
							//保存的方式有:1.保存到一个标签属性中  2.可以保存到一个js的变量中  3.可以保存到sessionStorage/localStroage
							$("#curDepartName").attr("curDeptId", deptIdVal);
					
					
							$.getJSON("<%=path%>/department/listDirectSubDept", {
								deptId : deptIdVal
							}, function(data) {
								console.log(data);
					
								$("#deptTabBody").html("");
								for (var i = 0; i < data.length; i++) {
									var trStr = "<tr>" +
										"<td>" + data[i].id + "</td>" +
										"<td>" + data[i].name + "</td>" +
										"<td>" + data[i].code + "</td>" +
										"<td>" + data[i].note + "</td>" +
										"<td>" +
										"<button onclick='editDept(" + data[i].id + ")' class='btn btn-primary'>编辑部门</button>" +
										"&nbsp;<button onclick='deleteDept(" + data[i].id + ")' class='btn btn-primary'>删除部门</button>" +
										"</td>" +
										"</tr>";
					
									$("#deptTabBody").append(trStr);
								}
							})
						}
						//------------删除部门
						function deleteDept(deptIdVal) {
							//1.通过ajax请求删除部门;2.刷新部门列表
							$.getJSON("<%=path%>/department/delete", {
								deptId : deptIdVal
							}, function(data) {
								if (data.redultCode == "1") {
									alert("部门删除成功!");
									listSubDept(deptId, '');
								}
								else
									alert("部门删除失败!");
							})
						}
					
						//更新部门
						$(function() {
							//监听添加按钮的点击事件，被点击时候保存部门信息
							$("#btnAddSave").click(function() {
								//获取当前部门的id
								var curDeptId = $("#curDepartName").attr("curDeptId");
								var deptName = $("#deptName").val();
								var deptCode = $("#deptCode").val();
								var deptNote = $("#deptNote").val();
					
					
								if (curDeptId == null) {
									alert("请先选择父亲部门！");
									return;
								}
					
								console.log("------>" + curDeptId);
					
								//向服务器请求保存数据
								$.getJSON("<%=path%>/department/add", {
									name : deptName,
									code : deptCode,
									note : deptNote,
									parentId : curDeptId
								},
									function(data) {
										if (data.resultCode == 1) {
											//保存成功,刷新部门列表
											listSubDept(curDeptId, '');
										} else {
											alert("保存失败!");
										}
					
										//关闭模态框
										//$('#myModal').modal('hide');//关闭后打开，之前的数据仍然存在
										$('#myModal').modal('toggle');
					
										//清除输入框的值
										$("#deptName").val("");
										$("#deptCode").val("");
										$("#deptNote").val("");
									});
							})
					
						})
					
						//---------------更新部门信息
						function editDept(deptIdVal) {
							//如何保存被编辑部门的id???可以使用一个hidden来保存
							$("#deptId").val(deptIdVal);
					
							//通过代码打开编辑窗,backdrop: 配置点击空白处时候，是否隐藏窗口
							$('#myModalEdit').modal({
								backdrop : true
							});
					
							//从服务器获取最新的部门的数据,将数据填入到编辑框中
							$.getJSON("<%=path%>/department/get", {
								deptId : deptIdVal
							}, function(data) {
								$("#deptName1").val(data.name);
								$("#deptCode1").val(data.code);
								$("#deptNote1").val(data.note);
							});
						}
					
						$(function() {
							$("#btnUpdateSave").click(function() {
								//保存编辑的数据
								var deptName = $("#deptName1").val();
								var deptCode = $("#deptCode1").val();
								var deptNote = $("#deptNote1").val();
					
								var deptId = $("#deptId").val();
					
								$.getJSON("<%=path%>/department/update", {
									name : deptName,
									code : deptCode,
									note : deptNote,
									id : deptId
								}, function(data) {
									if (data.resultCode == '1') {
										//刷新部门不列表信息
										//获取当前部门的id
										var curDeptId = $("#curDepartName").attr("curDeptId");
										listSubDept(curDeptId, '');
					
										alert("更新成功!");
					
										//关闭窗口
										$('#myModalEdit').modal('toggle');
					
										//清除表单内容
										$("#deptName1").val("");
										$("#deptCode1").val("");
										$("#deptNote1").val("");
					
									} else {
										alert("更新失败!");
									}
								})
					
							});
						})
					</script>

				</div>
			</div>
			<div class="col-md-9  left_border_div">
				<div class="row menu_bar">
					<div class="col-md-10">
						当前的部门：<span id="curDepartName"></span>
					</div>
					<div class="col-md-2">
						<button id="btnAdd" type="button" class="btn btn-primary"
							data-toggle="modal" data-target="#myModal">添加部门</button>

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

	<!-- 添加部门模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加部门</h4>
				</div>
				<div class="modal-body">
					<form>
						<input type="hidden" id="deptId">
						<div class="form-group">
							<label for="deptName">部门名称</label> <input type="text"
								class="form-control" id="deptName" placeholder="部门名称">
						</div>
						<div class="form-group">
							<label for="deptCode">部门编码</label> <input type="text"
								class="form-control" id="deptCode" placeholder="部门编码">
						</div>
						<div class="form-group">
							<label for="deptNote">部门说明</label> <input type="text"
								class="form-control" id="deptNote" placeholder="部门说明">
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
	<!-- 编辑部门模态框 -->
	<div class="modal fade" id="myModalEdit" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">编辑部门</h4>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="deptName">部门名称</label> <input type="text"
								class="form-control" id="deptName1" placeholder="部门名称">
						</div>
						<div class="form-group">
							<label for="deptCode">部门编码</label> <input type="text"
								class="form-control" id="deptCode1" placeholder="部门编码">
						</div>
						<div class="form-group">
							<label for="deptNote">部门说明</label> <input type="text"
								class="form-control" id="deptNote1" placeholder="部门说明">
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

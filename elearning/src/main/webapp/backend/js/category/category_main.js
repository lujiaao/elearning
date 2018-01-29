d = new dTree('d');
var path="/el";

$(function() {
	// 获取服务器端的目录列表，并显示
	$.getJSON(path+"/category/list", function(data) {
		console.log(data.length);
		console.log(data);

		// 显示树

		d.add(0, -1, '分类列表');
		for (var i = 0; i < data.length; i++) {
			if (data[i].parentId == null)
				d.add(data[i].id, 0, data[i].catName, "javascript:listSubCat("
						+ data[i].id + ",'" + data[i].catName + "')");
			else
				d.add(data[i].id, data[i].parentId, data[i].catName,
						"javascript:listSubCat(" + data[i].id + ",'"
								+ data[i].catName + "')");
		}
		// 列出第一个分类的子分类
		listSubCat(data[0].id, data[0].catName);

		var str = d.toString();

		// document.write(d);
		$("#dtree").append(str);
	});

})

function listSubCat(catIdVal, parentCatName) {

	if (parentCatName != '')
		$("#curCatName").html(parentCatName);
	// 保存当前分类的id,在添加子分类时候需要使用。
	// 保存的方式有:1.保存到一个标签属性中 2.可以保存到一个js的变量中 3.可以保存到sessionStorage/localStroage
	$("#curCatName").attr("curCatId", catIdVal);

	$.getJSON(path+"/category/listSubCat", {
		parentCatId : catIdVal
	}, function(data) {
		console.log(data);

		$("#categoryTabBody").html("");
		for (var i = 0; i < data.length; i++) {
			var trStr = "<tr>" + "<td>" + data[i].id + "</td>" + "<td>"
					+ data[i].catName + "</td>" + "<td>" + data[i].catCode
					+ "</td>" + "<td>" + "<button onclick='editCat("
					+ data[i].id + ")' class='btn btn-primary'>编辑分类</button>"
					+ "&nbsp;<button onclick='deleteCat(" + data[i].id
					+ ")' class='btn btn-primary'>删除分类</button>" + "</td>"
					+ "</tr>";

			$("#categoryTabBody").append(trStr);
		}
	})
}

// ------------删除
function deleteCat(idVal) {
	// 1.通过ajax请求删除分类;2.刷新列表
	$.getJSON(path+"/category/delete", {
		catId : idVal
	}, function(data) {
		if (data.redultCode == "1") {
			alert("删除成功!");
			listSubCat(idVal, '');
		} else
			alert("删除失败!");
	})
}

// 添加
$(function() {
	// 监听添加按钮的点击事件，被点击时候保存信息
	$("#btnAddSave").click(function() {
		// 获取当前分类的id
		var curCatId = $("#curCatName").attr("curCatId");
		var name = $("#name").val();
		var code = $("#code").val();

		if (curCatId == null) {
			alert("请先选择父亲分类！");
			return;
		}

		console.log("------>" + curCatId);

		// 向服务器请求保存数据
		$.getJSON(path+"/category/add", {
			name : name,
			code : code,
			parentId : curCatId
		}, function(data) {
			if (data.resultCode == 1) {
				// 保存成功,刷新列表
				listSubCat(curCatId, '');
			} else {
				alert("保存失败!");
			}

			// 关闭模态框
			// $('#myModal').modal('hide');//关闭后打开，之前的数据仍然存在
			$('#myModal').modal('toggle');

			// 清除输入框的值
			$("#name").val("");
			$("#code").val("");
		});
	})

})

// ---------------更新
function editCat(deptIdVal) {
	// 如何保存被编辑部门的id???可以使用一个hidden来保存
	$("#deptId").val(deptIdVal);

	// 通过代码打开编辑窗,backdrop: 配置点击空白处时候，是否隐藏窗口
	$('#myModalEdit').modal({
		backdrop : true
	});

	// 从服务器获取最新的部门的数据,将数据填入到编辑框中
	$.getJSON(path+"/department/get", {
		deptId : deptIdVal
	}, function(data) {
		$("#deptName1").val(data.name);
		$("#deptCode1").val(data.code);
		$("#deptNote1").val(data.note);
	});
}

$(function() {
	$("#btnUpdateSave").click(function() {
		// 保存编辑的数据
		var deptName = $("#deptName1").val();
		var deptCode = $("#deptCode1").val();
		var deptNote = $("#deptNote1").val();

		var deptId = $("#deptId").val();

		$.getJSON(path+"/department/update", {
			name : deptName,
			code : deptCode,
			note : deptNote,
			id : deptId
		}, function(data) {
			if (data.resultCode == '1') {
				// 刷新部门不列表信息
				// 获取当前部门的id
				var curCatId = $("#curCatName").attr("curCatId");
				listSubCat(curCatId, '');

				alert("更新成功!");

				// 关闭窗口
				$('#myModalEdit').modal('toggle');

				// 清除表单内容
				$("#deptName1").val("");
				$("#deptCode1").val("");
				$("#deptNote1").val("");

			} else {
				alert("更新失败!");
			}
		})

	});
})

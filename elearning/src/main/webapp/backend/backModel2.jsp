<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<!-- 导入公共样式 -->
<jsp:include page="common/link.jsp"/>
<!-- 该页面特有的样式 -->
<link rel="stylesheet" type="text/css" href="css/theme.css">
<link rel="stylesheet" type="text/css" href="css/premium.css">

<title>Insert title here</title>
</head>
<body class="theme-blue">
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="left.jsp"></jsp:include>
	<!--这是main的头部分-->
	<div class="content">
		<div class="header">这是头部内容，可以扩充，也可以不要</div>

		<!--真正的中间部分-->
		<div class="main-content">
			这里是正真要跳转的地方
			<!--尾部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>

	<script src="bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
		});
	</script>
</body>
</html>
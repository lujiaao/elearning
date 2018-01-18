<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String appPath = request.getContextPath();
 %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 导入公共样式 -->
<jsp:include page="common/link.jsp"/>
<!-- 该页面特有的样式 -->
<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/theme.css">
<link rel="stylesheet" type="text/css" href="<%=appPath %>/backend/css/premium.css">

<title>Insert title here</title>
</head>
  <frameset rows="7%,*">
		<frame src="<%=appPath %>/backend/top.jsp" />
		<frameset cols="20%,*">
			<frame src="<%=appPath %>/backend/left.jsp" />
			<frame src="<%=appPath %>/backend/content.jsp" name="mainFx" id="mainFx"  />
		</frameset>		
	</frameset>
</html>
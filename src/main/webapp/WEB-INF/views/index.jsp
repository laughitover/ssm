<%@page import="com.channelsoft.ssm.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
名字:<%=((User)request.getAttribute("user")).getName() %>
</body>
</html>

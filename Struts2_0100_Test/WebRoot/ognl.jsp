<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ognl.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
访问值栈中的action的普通属性: username = <s:property value="username"/><br>
password = <s:property value="password" /><br>
年龄<s:property value="user.age" /><br>

访问值栈中对象的普通方法：<s:property value="password.length()"/><br>
访问值栈中对象的普通属性: <s:property value="cat.friend.name"  />
<s:property value="@ognl.S@s()"/>
<s:property value="new ognl.User(8)"/>

     
     <s:debug></s:debug>
  </body>
</html>

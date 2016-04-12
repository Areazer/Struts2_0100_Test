<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Tag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>定义bean,并使用param来设定新的属性值::
     <s:bean name="tags.Dog" >
				<s:param name="name" value="'pp'"></s:param>
				<s:property value="name"/>
				
			</s:bean> <br>
			
			查看debug情况:
			<s:bean name="tags.Dog" var="myDog">
				<s:param name="name" value="'oudy'"></s:param>   用param改默认的属性
			</s:bean>
			<s:debug></s:debug>
  </body>
</html>

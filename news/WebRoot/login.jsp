<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
  <meta charset="UTF-8">
	<base href="<%=basePath%>">
	<title>登录页面</title>
  </head>
  
  <body>
  	<form action="system/login.shtml">
  	<label>${msg}</label>
    <label> 
  		用戶名<input type="text" id="usersname" name="usersName">
    <br/>
    </label>
   <label>
   		 密码<input type="text" id="password" name="password">
   </label>
   <input type="submit" value="提交">
   </form>
  </body>
	
	
</html>

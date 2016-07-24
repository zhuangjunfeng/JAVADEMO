<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<base href="<%=basePath%>">
	<title>新闻页面</title>
</head>
<body>
	<div class="container">
			<form action="system/addNews.shtml">
				<label>
					增加新闻id<input type="text" id="newsId" name="news.newsId">
				</label>
				<br/>
				<label> 
				增加新闻的类型
				</label>
				<input type="text" id="newsType" name="news.newsType" >
				<br/>
				<label>
					增加新闻标题<input type=text id="newsTitle" name="news.newsTitle">
				</label>
				<br/>
				<label for="xwnr">
					增加新闻内容
				</label>
				<textarea id="newsContent" style="height: 112px; width: 262px" name="news.newsContent"></textarea><br/>
				<br/>
				<label for="xwnr">
					修改时间
				</label>
				<textarea id="editorTime" style="height: 112px; width: 262px" name="news.editorTime"></textarea><br/>
				<input  type="submit" value="保存">
				<br/>
				</form>
				<form action="system/delNews.shtml">
				<label>
				请输入要删除的新闻的ID：
				</label>
				<input type="text" id="newsId" name="newsId">
				<label>
				请输入要删除的新闻的类型：
				</label>
				<input type="text" id="newsType" name="newsType">
				<input  type="submit" value="删除"> 
				<label>	${msg}</label>
				</form>
				<br/>
				<form action="system/updateNews.shtml">
				<label>
					需要更新的新闻的id<input type="text" id="newsId" name="news.newsId">
				</label>
				<br/>
				<label> 
				更新的新闻类型   
				</label>
				<input type="text" id="newsType" name="news.newsType" >
				<br/>
				<label>
					更新新闻标题<input type=text id="newsTitle" name="news.newsTitle">
				</label>
				<br/>
				<label for="xwnr">
					更新新闻内容
				</label>
				<textarea id="newsContent" style="height: 112px; width: 262px" name="news.newsContent"></textarea><br/>
				<br/>
				
				<input  type="submit" value="更新">
				<br/>
				<label>${msg}</label>
				</form><br/>
				
				<form action="system/queryNews.shtml">
				<label>
				查询全部新闻：
				</label>
				<input  type="submit" value="查询">
				<br/>	
				<table>
					<tr>
						<td>新闻编号</td>
						<td>新闻类型</td>
						<td>新闻标题</td>
						<td>新闻内容</td>
						<td>操作</td>
					</tr>
				 <c:forEach var="i" items="${NewsList}"> 
				 		<tr>
				 			<td><c:out value="${i.newsId}"/></td>
				 			<td><c:out value="${i.newsType}"/></td>
				 			<td><c:out value="${i.newsTitle}"/></td>
				 			<td><c:out value="${i.newsContent}"/></td>
				 			<td><a href="system/delNews.shtml?newsId=<c:out value="${i.newsId}"/>">删除</a></td>
				 		</tr>
				  </c:forEach>			
				</table>
				</form>
				
		</div>
</body>
</html>
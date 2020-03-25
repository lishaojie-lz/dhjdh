<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商铺列表</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
     <h1>商品列表</h1>
     <button class="btn btn-info" type="button" onclick="add()">添加</button>
     <table class="table">
     	<tr>
     		<td>编号</td>
     		<td>商铺名称</td>
     		<td>创建日期</td>
     		<td>销售的商品</td>
     		<td>操作</td>
     	</tr>
     	<c:forEach items="${shops }" var="shop" varStatus="i">
     		<tr>
     			<td>${i.count }</td>
     			<td>${shop.name }</td>
     			<td><fmt:formatDate value="${shop.created }" pattern="yyyy-MM-dd"/></td>
     			<td>
     				<c:forEach items="${shop.goods }" var="good" >
     					${good.name }
     				</c:forEach>
     			</td>
     			<td><a href="/detail?id=${shop.id }">详情</a></td>
     		</tr>
     	</c:forEach>
     </table>
     <script type="text/javascript">
     	function add(){
     		location.href="add";
     	}
     </script>
</body>
</html>
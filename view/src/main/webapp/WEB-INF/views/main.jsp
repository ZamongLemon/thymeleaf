<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<style>
table,tr,td,th{border:solid 1px;}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<div>
<table>
<tr>
    <th>언어</th>
    <th>프레임 워크</th>
    <th>데이터베이스</th>
    <th>통합 개발 환경</th>
    <th>개발 도구</th>
    <th>서버</th>
</tr>
<tr>
    <td>${map.language}</td>
    <td>${map.Framework}</td>
    <td>${map.Database}</td>
    <td>${map.IDE}</td>
    <td>${map.Build_Tool}</td>
    <td>${map.WAS}</td>
</tr>
</table>
</div>

<div>
<table>
<c:forEach items="${list}" var="job">
<tr>
<td>${job}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>
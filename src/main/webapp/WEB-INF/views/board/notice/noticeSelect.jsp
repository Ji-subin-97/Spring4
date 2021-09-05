<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Notice Select</title>
	<c:import url="../../temp/boot_head.jsp"></c:import>
</head>
<body>
	<c:import url="../../temp/boot_nav.jsp"></c:import>
	<h1>Notice 상세 페이지입니다.</h1>
	
	<div class="container-fluid">
		<h1>num : ${dtov.num}</h1>
		<h1>title : ${dtov.title}</h1>
		<h1>contents : ${dtov.contents}</h1>
		<h1>writer : ${dtov.writer}</h1>
		<h1>date : ${dtov.regdate}</h1>
		<h1>hits : ${dtov.hits}</h1>
	</div>
	
</body>
</html>
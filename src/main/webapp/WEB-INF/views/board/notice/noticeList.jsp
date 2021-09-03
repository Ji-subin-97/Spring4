<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<c:import url="../../temp/boot_head.jsp"></c:import>
	</head>
	<body>
		<c:import url="../../temp/boot_nav.jsp"></c:import>
		<h1>List</h1>
		<div class="container-fluid">
			<div class="col-md-8 mx-auto my-0">
				<table class="table table-dark table-striped">
					<thead>
						<tr>
							<th>번호</th><th>제목</th><th>내용</th><th>작성자</th><th>작성일</th><th>조회수</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="list">
							<tr>
								<td>${list.num}</td>
								<td><a href="${pageContext.request.contextPath}/board/notice/noticeSelect?num=${list.num}">${list.title}</a></td>
								<td>${list.contents}</td>
								<td>${list.writer}</td>
								<td>${list.regdate}</td>
								<td>${list.hits}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="./noticeInsert" class="btn btn-outline-primary">글 쓰기</a>
			</div>
		</div>
	</body>
	
	
</html>
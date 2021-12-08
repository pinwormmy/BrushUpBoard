<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>


<html>
<head>
	<title>게시판 제작 복습</title>
<body>
<h2>
	게시판 제작 복습하기
</h2>

<P>최대한 구글링 자제하면서 재구현하기.</P>
<div>코드 한줄 한줄 다 이해하고 진행~ </div>
<hr>

<table>
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일자</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>뺣</td>
			<td>제목 테스트 꿀꿀</td>
			<td>아디</td>
			<td>글쓴시간</td>
			<td>인기는?</td>
		</tr>
	</tbody>
</table>

<hr>

<button type="button" onclick="location.href='/write'">글쓰기</button>

</body>
</html>

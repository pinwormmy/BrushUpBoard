<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
	<title>게시물 작성</title>
<body>
	
	<form>
		제목 <input type="text" name="postTitle"><br>
		작성자 <input type="text" name="writer"><br>
		내용 <input type="text" name="postContent"><br>
		<input type="button" value="게시하기">
		<button type="button" onclick="location.href='/'">글목록</button>
	</form>

</body>
</html>

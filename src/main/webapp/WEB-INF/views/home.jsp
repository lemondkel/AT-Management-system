<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8" http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>
</head>
<body>
	<h1>Hello ${User.name}!</h1>
	<P>Your age is ${User.age}.</P>
	<p>Your nick is ${User.nick}.</p>

	<div class="container">
		<h4>메일 보내기</h4>
		<form action="mailSending" method="post">
			<div align="center">
				<!-- 받는 사람 이메일 -->
				<input type="text" name="tomail" size="120" style="width: 100%"
					placeholder="상대의 이메일" class="form-control">
			</div>
			<div align="center">
				<!-- 제목 -->
				<input type="text" name="title" size="120" style="width: 100%"
					placeholder="제목을 입력해주세요" class="form-control">
			</div>
			<p>
			<div align="center">
				<!-- 내용 -->
				<textarea name="content" cols="120" rows="12"
					style="width: 100%; resize: none" placeholder="내용#"
					class="form-control"></textarea>
			</div>
			<p>
			<div align="center">
				<input type="submit" value="메일 보내기" class="btn btn-warning">
			</div>
		</form>
	</div>

	<script>
		$.ajax({
			url : 'sayHello',
			method : 'GET',
			beforeSend : function() {
				console.log("요청 보내기 전");
			},
			success : function(data) {
				console.log(data);
			},
			complete : function() {
				console.log("End");
			},
			error : function(e) {
				console.log(e);
			}
		})
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	
	<h3>회원 가입</h3>
	<hr>
	<table border="1" cellpadding="0" cellspacing="0" size="600">
	
		<form action="joinOk">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="mid" size="60">	
				</td>		
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="text" name="mpw" size="60">	
				</td>		
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="mname" size="60">	
				</td>		
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<input type="text" name="memail" size="60">	
				</td>		
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="회원가입">	
				</td>		
			</tr>
		</form>
	</table>
</body>
</html>
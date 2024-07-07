<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/title.css">
<title>JDY Profile</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<br><br>
	<table border="0" cellpadding="20" cellspacing="0" >
		<tr>
			<td align="center">
				<span class="title_text01">JDY's PROFILE</span>
			</td>
		</tr>
		<tr>
			<td align="center">
				<span class="title_text02">My name is JDY, a novice developer who're dreaming to be a veteran developer.</span>
			</td>
		</tr>
		<tr>
			<td>
				<table border="0" cellpadding="20" cellspacing="0">
					<tr>
						<td class="skill_box">
							<span class="skill_text01">J</span><span class="skill_text02">AVA</span>
						</td>
						<td rowspan="6" class="image_box">
							<img src="/resources/img/springboot.jpg">
						</td>
					</tr>
					<tr>
						<td class="skill_box">
							<span class="skill_text01">J</span><span class="skill_text02">SP</span>
						</td>
					</tr>
					<tr>
						<td class="skill_box">
							<span class="skill_text01">S</span><span class="skill_text02">PRINGBOOT</span>
						</td>
					</tr>
					<tr>
						<td class="skill_box">
							<span class="skill_text01">H</span><span class="skill_text02">TML5&CSS</span>
						</td>
					</tr>
					<tr>
						<td class="skill_box">
							<span class="skill_text01">D</span><span class="skill_text02">ATABASE</span>
						</td>
					</tr>
					<tr>
						<td class="skill_box">
							<span class="skill_text01">J</span><span class="skill_text02">AVASCRIPT</span>
						</td>
					</tr>	
				</table>
			</td>
		</tr>	
	</table>
	<br><br>
	<jsp:include page="footer.jsp"/>	
</body>
</html>
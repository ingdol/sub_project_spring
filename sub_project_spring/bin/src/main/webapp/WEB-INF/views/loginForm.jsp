<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="js/jquery-3.6.0.min.js"></script>
		<script src="js/login.js"></script>
	</head>
	<body>
	<div id="wrap">	
		<section>
				<div id = "loginBox">
					<h3>로그인</h3> <br><br>
					<hr> <br><br>
					
					<table> 
					
						<tr> <!-- 3행 -->
							<td id="idPwdTd"> <!-- 회원 로그인 ID/PW --> 
								<div id = "login">
									<form id = "loginForm" name="loginForm" > 
										<!-- 아이디 -->
										<input type ="text" id ="id" name = "id" size = "40"
													placeholder = "MEMBER ID" autofocus> <br>
										<!-- 비밀번호 -->
										<input type ="password" id ="pwd" name = "pwd" size = "40"
													placeholder = "PASSWORD" autofocus> <br><br>
										<!--자바스크립트 else부분 <long_info.innerHTML = "로그인 실패";> 이 뜰수 있게 해주는 부분-->
										<span id="loginInfo"></span><br><br>
										<!-- 로그인 정보 전송 버튼 -->
										<input type="submit" id='submitBtn' value="LOG - IN" class="btn_submit"><br><br>
									</form></div></tr>
					</table>
				</div>
			</section>
		</div>
	</body>
</html>
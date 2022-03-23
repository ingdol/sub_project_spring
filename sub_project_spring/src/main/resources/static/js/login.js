/**
 * login.js
 */
 
 $(document).ready(function(){
	$('#loginForm').on('submit', function(){
		event.preventDefault();
		
		$.ajax({
			type:"post",
			url:"login",
			data:{"id":$('#id').val(),
						"pwd":$('#pwd').val()}, /*컨트롤러에서 받을 때 : id, pw로 받음*/
			dataType:"text",
			success:function(result){
				if(result == "success"){
					alert("환영합니다.\n즐거운 쇼핑되세요!");
					location.href="/";
				}else if(result == "fail"){
					if($('#id').val() == ""){
						alert("아이디를 입력하세요");
						$('#id').focus();   // $(this)도 가능
						return false;
					} else if ($('#pwd').val() == "") {
							alert("비밀번호를 입력하세요.");
							$('#pwd').focus();  // $(this)도 가능
							return false;
					} else {
						alert("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
				}
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
		
	});
});
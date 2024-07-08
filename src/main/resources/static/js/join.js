/**
 * 
 */

function joinCkeck() {
	
	if(document.joinForm.mid.value.length==0) {
		alert("아이디는 필수입력사항비니다. 다시 확인해주세요.");
		return false;		
	}
	if(document.joinForm.mpw.value.length==0) {
			alert("")			
			return false;		
	}
	if(document.joinForm.mname.value.length==0) {
			alert("");
			return false;		
	}
	if(document.joinForm.memail.value.length==0) {
			alert("");
			return false;		
	}
	if(document.joinForm.mpw.value.length != document.joinForm.mpwCheck.value) {
				alert("")			
				return false;		
	}
	
	document.joinForm.submit();
	
}
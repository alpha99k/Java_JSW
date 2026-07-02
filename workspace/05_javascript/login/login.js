const loginForm = document.querySelector('.login-form')
loginForm.addEventListener('submit',function(){
    console.log('로그인요청')
    event.preventDefault(); //브라우저 기본 동작 취소(submit 취소)


    //브라우저의 유효성 검증 결과를 확인 (requrired, pattern등)
    if(!loginForm.checkValidty()){
        return;
    }
});
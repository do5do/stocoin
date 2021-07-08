<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<a href="javascript:kakaoLogin();">로그인</a>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>

<script>
    window.kakao.init("3ca9749bb691b26feae7120981caa63b");
    function kakaoLogin(){
        window.kakao.Auth.login({
            scope:'profile,account_email',
            success:function(authObj){
                console.log(authObj);
                window.kakao.API.request({
                    url:'/v2/user/me',
                    success:res => {
                        const kakao_account = res.kakao_account;
                        console.log(kakao_account);
                    }
                });
            }
        });
    }
</script>   

</body>
</html>
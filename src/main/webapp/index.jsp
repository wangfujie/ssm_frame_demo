<html>
<head>
    <LINK rel="Bookmark" href="static/images/iconTitle.png" >
    <LINK rel="Shortcut Icon" href="static/images/iconTitle.png" />
</head>
<body>
<h2>Hello World!</h2>
<h5>登录成功！欢迎${sessionScope.user.role_name}</h5>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"",
            Type:"POST",
            data:{"login_name": "zhang3", "password": "123456"},
            success:function(data){
                if(data > 0){
                    alert("成功");
                }
            },
            dataType:"json"
        });
    });
</script>
</body>
</html>

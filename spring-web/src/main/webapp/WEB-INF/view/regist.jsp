<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/10/2
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>用户注册</h2>
<form action="${pageContext.request.contextPath}/regist.user" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"> <br>
    确认密码：<input type="password" name="repassword"> <br>
    <input type="submit" value="注册">
</form>
</body>
</html>


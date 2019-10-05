<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/9/29
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>用户登陆</h2>
<span style="color:red;">${loginError}</span>
<form action="${pageContext.request.contextPath}/login.user" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"> <br>
    <input type="submit" value="登陆">
</form>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/10/17
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>用户注册</h2>
<form action="${pageContext.request.contextPath}/session/step2" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"> <br>
    <input type="submit" value="下一步">
</form>
</body>
</html>


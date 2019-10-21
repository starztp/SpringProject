<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/10/17
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>用户注册</h2>

<form action="${pageContext.request.contextPath}/session/regist" method="post">
    年龄：<input type="text" name="age"> <br>
    地址：<input type="text" name="address"> <br>
    <input type="submit" value="注册">
</form>
</body>
</html>


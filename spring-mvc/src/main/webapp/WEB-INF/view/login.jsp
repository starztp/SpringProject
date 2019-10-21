<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/10/8
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script src="${pageContext.request.contextPath}/js/hello.js"></script>
</head>
<body>
<h2>用户登陆</h2>
<span style="color:red">${loginError}</span>
<form action="${pageContext.request.contextPath}/param/getfrombody" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"> <br>
    <input type="submit" value="登陆">
</form>

<img src="${pageContext.request.contextPath}/img/wow.jpg">
</body>
</html>


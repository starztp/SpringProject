<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/10/20
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>

<a href="${pageContext.request.contextPath}/file/download?filename=B94A1715.JPG">下载文件:使用请求参数传递文件名</a>
<a href="${pageContext.request.contextPath}/file/download/springMVC.JPG">下载文件:使用rest风格传递文件名</a>
<br>
<a href="${pageContext.request.contextPath}/file/download2?filename=springMVC.JPG">下载文件:使用ResponseEntity</a>
</body>
</html>


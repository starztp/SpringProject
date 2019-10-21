<%--
  Created by IntelliJ IDEA.
  User: 60295
  Date: 2019/10/19
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="${pageContext.request.contextPath}/WEB-INF/js/jquery.js"></script>
    <script>
        $(function(){
            $('#btn').on('click',function(){
                $.post('${pageContext.request.contextPath}/ajax/test2',function(data){
                    console.log(data);
                });
            });
        });
    </script>
</head>
<body>
<button id="btn">发送AJAX请求</button>
</body>
</html>



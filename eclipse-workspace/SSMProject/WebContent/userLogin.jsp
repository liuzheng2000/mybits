<%--
  Created by IntelliJ IDEA.
  User: 15533
  Date: 2019/10/19
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String UserName = (String) request.getAttribute("UserName");
%>
欢迎 <%=UserName%>
</body>
</html>

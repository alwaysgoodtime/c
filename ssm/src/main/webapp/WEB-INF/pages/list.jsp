<%--
  Created by IntelliJ IDEA.
  User: goodtime
  Date: 2020/2/1
  Time: 3:28 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有账户</h3>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>

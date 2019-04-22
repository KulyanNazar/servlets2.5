<%--
  Created by IntelliJ IDEA.
  User: Nazariy_Kulyan
  Date: 4/15/2019
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/home">back</a>
    <form name="form" method="post">
        <input type="text" name="mainInput" id="mainInput">
        <button type="submit">send</button>
    </form>
    <h1>Previous result:${sessionScope.get("text")}</h1>
</body>
</html>

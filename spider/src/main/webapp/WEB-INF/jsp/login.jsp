<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2019/3/4
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<div>hello world!</div>--%>
    <form action="/user/validate" method="post">
        <div style="border: 1px solid black;">
            <label>用户名:</label>
            <input type="text" name="name" /><br>
            <label>密码:</label>
            <input type="text" name="password" /><br>
            <button type="submit">登&nbsp;录</button>
        </div>
    </form>

</body>
</html>

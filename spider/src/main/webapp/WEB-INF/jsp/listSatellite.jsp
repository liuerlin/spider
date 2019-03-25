<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2019/3/6
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>卫星展示</title>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
    <style>
        th,td{
            border: 1px solid black;
            cursor: pointer;
        }
    </style>
    <script>
        $(function () {
            $("th").click(function (){
                var columnName = $(this).text();
                /*alert(columnName);*/
                window.location = "/satellite/searchAllOrderByField?columnName="+columnName;
            })
        })
/*        function loginOut() {
            
        }*/
    </script>
</head>
<body>
    <div>
        <table>
            <tr>
                <th>sate_name</th>
                <th>launch_time</th>
                <th>ground_height</th>
                <th>weight</th>
            </tr>
            <c:forEach items="${requestScope.result}" var="rs">
                <tr>
                    <td>${rs.satellite_name}</td>
                    <td>${rs.launch_time}</td>
                    <td>${rs.height}</td>
                    <td>${rs.weight}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <%--<div><input type="button" value="退出" onclick="loginOut()" /></div>--%>
</body>
</html>

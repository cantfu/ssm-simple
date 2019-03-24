<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>
</head>
<body>
    <h4>${requestScope.testAttr}</h4>
    <table>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>工资</td>
        </tr>
        <c:forEach items="${allEmps }" var="emp">

            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.age}</td>
                <td>${emp.salary}</td>
            </tr>

        </c:forEach>
    </table>
</body>
</html>

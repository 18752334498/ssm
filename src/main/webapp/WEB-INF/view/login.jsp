<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body style="text-align: center; font-size: 150%">
<c:if test="${empty list}">
    <span style="color: blue">跳过了controller,直接访问了jsp...</span>
</c:if>

<c:if test="${!empty list}">
    <c:forEach items="${list}" var="a">
        <span>${a.id}</span>&nbsp;&nbsp;
        <span>${a.name}</span>&nbsp;&nbsp;
        <span>${a.age}</span>
        <hr/>
    </c:forEach>
</c:if>
</body>
</html>
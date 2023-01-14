<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<form:form action="/sinh-vien/add" method="POST" modelAttribute="sv1">
    Mã: <form:input path="ma"/>
    <br/>
    Tên: <form:input path="ten"/>
    <br/>
    Tuổi: <form:input path="tuoi"/>
    <br/>
    <form:button type="submit">Add</form:button>
</form:form>
</body>
</html>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<section>
    <form:form modelAttribute="x">
        <form:input path=""></form:input>
    </form:form>
</section>
<section>
    <table>
        <thead>
        <tr>
            <td>Ma</td>
            <td>FullName</td>
            <td>Username</td>
            <td>Isuse</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lst}" var="x">
            <tr>
                <td>${x.ma}</td>
                <td>${x.fullName}</td>
                <td>${x.userName}</td>
                <td>${x.ma}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
</body>
</html>
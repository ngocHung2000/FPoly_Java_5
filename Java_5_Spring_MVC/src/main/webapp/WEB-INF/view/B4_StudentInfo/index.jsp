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

<%--    <form:form modelAttribute="find" method="post">--%>
<%--        Ten : <form:input path="dataFind"></form:input><br>--%>
<%--    </form:form>--%>

    <form:form method="post" modelAttribute="obj">
        Ma : <form:input path="ma"/><br/>
        Ten : <form:input path="ten"/><br/>
        Tuoi : <form:input path="tuoi"/><br>
        Que : <form:input path="que"/><br>
        <form:button  formaction="/student-info/add" type="submit">Add</form:button>
    </form:form>
</section>
<section>
    <table>
        <thead>
        <tr>
            <td>Ma</td>
            <td>Ten</td>
            <td>Tuoi</td>
            <td>Que quan</td>
            <td></td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lst}" var="x">
            <tr>
                <td>${x.ma}</td>
                <td>${x.ten}</td>
                <td>${x.tuoi}</td>
                <td>${x.que}</td>
                <td>
                    <button formaction="/student-info/detail/${x.ma}">Detail</button>
                    <button formaction="/student-info/edit/${x.ma}">Edit</button>
                    <button formaction="/student-info/remove/${x.ma}">Remove</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
</body>
</html>
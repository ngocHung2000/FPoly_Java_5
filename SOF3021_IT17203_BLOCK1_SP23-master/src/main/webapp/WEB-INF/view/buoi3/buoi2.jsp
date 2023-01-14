<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<table>
    <form action="/sinh-vien/search" method="get" >
        <input placeholder="nhập " id="ten" name="ten1" >
        <button type="submit">tìm kiếm</button>
    </form>
    <button><a href="/sinh-vien/view-add">Add Sinh Vien</a></button>
    <thead>
    <tr>
        <th>Mã</th>
        <th>Họ và tên</th>
        <th>Tuổi</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sinhViens}" var="acc">
        <tr>
            <td>${acc.ma}</td>
            <td>${acc.ten}</td>
            <td>${acc.tuoi}</td>
            <td><button><a href="/sinh-vien/detail/${acc.ma}">Detail</a></button></td>
            <td><button><a href="/sinh-vien/delete/${acc.ma}">Delete</a></button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
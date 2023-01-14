<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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

<%--        <form>--%>
<%--            <div>--%>
<%--                <input type="text" name="min"  placeholder="Cân nặng min">--%>
<%--            </div>--%>
<%--            <div>--%>
<%--                <input type="text" name="max"  placeholder="Cân nặng max">--%>
<%--            </div>--%>
<%--            <div><button formaction="/dong-vat/find">Find</button></div>--%>
<%--        </form>--%>
        <hr>
        <form method="POST">
            <div>
                <input type="text" name="min"  placeholder="Cân nặng min">
            </div>
            <div>
                <input type="text" name="max"  placeholder="Cân nặng max">
            </div>
            <div><button formaction="/dong-vat/find">Find</button></div>

            <div>
                Mã : <input type="text" name="ma"  placeholder="Mã" value="${ma}">
            </div>
            <div>
                Tên : <input type="text" name="ten"  placeholder="Tên" value="${ten}">
            </div>
            <div>
                Cân nặg : <input type="text" name="canNang"  placeholder="Cân nặng" value="${canNang}">
            </div>
            <div>
                <button formaction="/dong-vat/them">Add</button>
                <button formaction="/dong-vat/update">Update</button>
            </div>

        </form>
    </section>

    <section>
        <table>
            <thead>
            <tr>
                <td>Mã</td>
                <td>Tên</td>
                <td>Cân nặng</td>
                <td></td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${lst}" var="x">
                <tr>
                    <td>${x.ma}</td>
                    <td>${x.ten}</td>
                    <td>${x.canNang}</td>
                    <td>
                        <button><a href="/dong-vat/detail/${x.ma}">Detail</a></button>
                        <button><a href="/dong-vat/remove/${x.ma}">Remove</a></button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </section>
</body>
</html>
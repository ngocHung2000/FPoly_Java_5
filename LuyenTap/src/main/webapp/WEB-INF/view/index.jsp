<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<%--    <section>--%>
<%--        <input method="get">--%>
<%--            Tên : <input name="ten"/><br>--%>
<%--            Số tuổi : <input name="tuoi"/><br>--%>
<%--            Khu vực : <input name="kv"/><br>--%>
<%--            <button formaction="">Search</button>--%>
<%--        </form>--%>
<%--    </section>--%>

    <section>
        <form:form modelAttribute="obj" method="post">
            Loại cây : <form:input path="loaiCay" value="${a.loaiCay}"/> <br>
            Tên : <form:input path="ten" value="${a.ten}"/><br>
            Số tuổi : <form:input path="tuoi" value="${a.tuoi}"/><br>
            Khu vực : <form:input path="kv" value="${a.kv}"/><br>
            <form:button formaction="/info/add">Add</form:button>
            <form:button formaction="/info/update">Update</form:button>
        </form:form>
    </section>

    <section>
        <table>
            <thead>
                <tr>
                    <td>Loại cây</td>
                    <td>Tên</td>
                    <td>Số tuổi</td>
                    <td>Khu vực</td>
                    <td>Action</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${lst}" var="x">
                    <tr>
                        <td>${x.loaiCay}</td>
                        <td>${x.ten}</td>
                        <td>${x.tuoi}</td>
                        <td>${x.kv}</td>
                        <td>
                            <button><a href="/info/detail/${x.ten}">Detail</a></button>
                            <button><a href="/info/remove/${x.ten}">Remove</a></button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </section>
</body>
</html>
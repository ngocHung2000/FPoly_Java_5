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

    <section>
        <form:form method="post" modelAttribute="obj">
            <form:input path="ma"/>
            <form:input path="ten"/>
            <form:input path="canNang"/>
            <form:input path="kv"/>
            <form:button type="submit" formaction="/Animal2/add">Add</form:button>
        </form:form>
    </section>

    <section>
        <table>
            <thead>
                <tr>
                    <td>Mã DV</td>
                    <td>Tên</td>
                    <td>Cân nặng</td>
                    <td>Khu vực</td>
                    <td>Action</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${lst}" var="x">
                    <tr>
                        <td>${x.ma}</td>
                        <td>${x.ten}</td>
                        <td>${x.canNang}</td>
                        <td>${x.kv}</td>
                        <td>
                            <button><a href="/Animal2/remove/${x.ma}">Remove</a> </button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </section>

</body>
</html>
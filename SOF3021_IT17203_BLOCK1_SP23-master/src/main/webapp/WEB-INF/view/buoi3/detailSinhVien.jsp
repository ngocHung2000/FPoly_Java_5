<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<label >Mã: </label>
<input class="form-control" id="ma" name="ma"
       placeholder="Enter name" value="${sinhVien.ma }"> <br>
<label >Tên: </label>
<input class="form-control" id="ten" name="ten"
       placeholder="Enter name" value="${sinhVien.ten }">  <br>
<label >Tuổi: </label>
<input class="form-control" id="tuoi" name="tuoi"x
       placeholder="Enter name" value="${sinhVien.tuoi }">  <br>
</body>
</html>
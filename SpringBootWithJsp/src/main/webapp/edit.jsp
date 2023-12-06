<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="https://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
</head>
<body>

<h2>Edit Product</h2>

<form action="/change/${employee.id}" method="post">
    <input type="hidden" name="_method" value="post">

    <label for="name">Name:</label>
    <input type="text" id="empName" name="empName" value="${employee.empName}" required><br>

    <label for="price">Price:</label>
    <input type="number" id="empSal" name="empSal" value="${employee.empSal}"  required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>

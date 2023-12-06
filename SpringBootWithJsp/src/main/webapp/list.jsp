<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
</head>
<body>

<h2>Product List</h2>

<table border="1" >
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Actions</th>
    </tr>
        <tr>
            <td>${employee.empId}</td>
            <td>${employee.empName}</td>
            <td>${employee.empSal}</td>
            <td>
                <a href="/edit/${employee.empId}">Edit</a>
                <a href="/delete/${employee.empId}">Delete</a>
            </td>
        </tr>
</table>

<a href="/employee/add">Add Product</a>

</body>
</html>

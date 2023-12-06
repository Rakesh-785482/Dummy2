<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>

<h2>Add Product</h2>

<form action="/addForm" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="empName" required><br>

    <label for="price">Price:</label>
    <input type="number" id="price" name="empSal"  required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>

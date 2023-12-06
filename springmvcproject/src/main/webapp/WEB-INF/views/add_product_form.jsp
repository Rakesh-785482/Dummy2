<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3 ">
				<h1 class="text-center mb-3">Fill the product details</h1>
				<form action="handle-product" method="post">
					<div class="form-group">
					
						<label for="name">Product Name</label> <input type="text"
							class="form-control" name="name"
							placeholder="Enter The Product Name Here">
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" name="description" id="description"
							row="5" placeholder="Enter The Product Description Here"></textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							class="form-control" name="price"
							placeholder="Enter Product Price Here">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"    
							class="btn btn-outline-danger">Back</a>  <!-- when i fire back instead of come it to localhost:8080 it keep my root name i.e productcrudapp -->
						<button type="submit" class="btn btn-success">Add</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>
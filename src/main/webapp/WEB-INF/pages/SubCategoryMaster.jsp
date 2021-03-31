<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Category Master</title>
<style type="text/css">
hr.new5 {
	border: 3px solid green;
	border-radius: 5px;
}
</style>
</head>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3 col-md-5 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center text-primary">WELCOME TO
							SUB-CATEGORY MASTER PAGE</h5>
						<hr class="new5">
						<select class="form-select" aria-label="Default select example">
							<c:forEach items="${list}" var="ob">
								<option value="${ob.productCategoryId}"><c:out
										value="${ob.productCategory}" /></option>
							</c:forEach>
						</select>

						<form class="form-signin" action="save" method="post">
							<div class="form-label-group">
								<label for="pc" class="text-success">Product
									Sub-Category</label> <input type="text" id="pc" class="form-control"
									placeholder="Product Sub Category" required autofocus
									name="productSubCatogory">
							</div>


							<div class="form-label-group">
								<label for="dsc" class="text-success">Description</label> <input
									type="text" id="dsc" class="form-control"
									placeholder="Description" required name="description">
							</div>
							<div>
								<P></P>
							</div>
							<button class="btn btn-lg btn-primary btn-block text-uppercase"
								type="submit">SAVE</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
${data1}
</html>
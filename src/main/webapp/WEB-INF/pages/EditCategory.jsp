<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
hr.new5 {
	border: 3px solid green;
	border-radius: 5px;
}

body {
	background: #f18973;
	background: linear-gradient(to right, #f18973, #33AEFF);
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center text-primary">CATEGORY
							MASTER EDIT</h5>
						<hr class="new5">
						<form:form class="form-signin" action="update" method="post"
							modelAttribute="cm1">

							<div class="row">
								<div class="col-5">
									<label class="text-info">Category Master Id ::</label>
								</div>
								<div class="col-4">
									<form:input path="productCategoryId" readonly="true" />
								</div>
							</div>

							<div class="row">
								<div class="col-5">
									<label class="text-info">Product Category ::</label>
								</div>
								<div class="col-4">
									<form:input path="productCategory" />
								</div>
							</div>
							<div class="row">
								<div class="col-5">
									<label class="text-info">Description ::</label>
								</div>
								<div class="col-4">
									<form:input path="productCategooryDescription" />
								</div>
							</div>
							<div>
								<p></p>
							</div>
							<button class="btn btn-lg btn-primary btn-block text-uppercase"
								type="submit">UPDATE</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Our Page</h1>
	<form:form action="" modelAttribute="scm">
		<form:select path="scm.categoryMaster.productCategoryId">
			<form:option value="">--Select--</form:option>
			<form:option value=""></form:option>
		</form:select>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<select name="cars" id="cars">
		<c:forEach items="${list}" var="ob">
			<option value="volvo"><c:out value="${ob}" /></option>
		</c:forEach>
	</select>
</body>
</html>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
	<head>
		<title> Student Confirmation</title>
	</head>
	<body>
		<h2>Hello, welcome to Students Confirmation</h2>
		<br/>
		Student Confirmed : ${student.firstName } ${student.lastName }  from ${student.country },
		loves ${student.favouriteLanguage}.
		 <br/>Worked upon
		 <ul>
		 	<c:forEach items="${student.os }" var="temp">
		 		<li>${temp }</li>
		    </c:forEach>
		 </ul> 
	</body>
</html>
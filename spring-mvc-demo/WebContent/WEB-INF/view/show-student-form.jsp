<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title> Student form</title>
	</head>
	<body>
		<h2>Hello, welcome to Students Form</h2>
		<form:form action="process-student-form" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br/>
			Last Name: <form:input path="lastName"/>
			<br/>
			<br/>
			Country: <form:select path="country">
						<form:options items="${student.countryOptions }"/>
						
					</form:select>
			<br/>
			<br/>
			Language: Java<form:radiobutton path="favouriteLanguage" value="Java"/>
					  C<form:radiobutton path="favouriteLanguage" value="C"/>
					  Golang<form:radiobutton path="favouriteLanguage" value="Golang"/>
					  Python<form:radiobutton path="favouriteLanguage" value="Python"/>
			<br/>
		    Operating Systems:<form:checkbox path="os" value="Windows"/>Windows
		    				  <form:checkbox path="os" value="Linux"/>Linux
		    				  <form:checkbox path="os" value="Mac"/>Mac
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>
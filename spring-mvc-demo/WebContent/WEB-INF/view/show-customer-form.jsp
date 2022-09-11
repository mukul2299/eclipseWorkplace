<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title> Customer form</title>
		<style>
			.error{
				color:red;
			}
		</style>
	</head>
	<body>
		<h2>Hello, welcome to Customer Form</h2>
		<form:form action="process-customer-form" modelAttribute="customer">
		<i>Fill out required(*) fields</i>
		<br/>
			First Name: <form:input path="firstName"/>
			<br/>
			<br/>
			Last Name(*): <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"></form:errors>
			<br/>
			<br/>
			Free Passes(*): <form:input path="freePass"/>
			<form:errors path="freePass" cssClass="error"></form:errors>
			<br/>
			<br/>
			Postal Code(*): <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"></form:errors>
			<br/>
			<br/>
			Course Code <form:input path="courseCode"/>
			<form:errors path="courseCode" cssClass = "error"></form:errors>
			<br/>
			<br/>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>
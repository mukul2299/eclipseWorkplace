<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Customer Form</title>
	
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relation Manger</h2>
		</div>
		<div id="container">
			<h3>Save Customer</h3>
			<form:form action="saveCustomer" modelAttribute="customer" method="POST">
				<form:hidden path="id"/>
				<table>
					<tr>
						<td><label>First Name: </label></td>
						<td><form:input path="firstName"/></td>
					</tr>
					<tr>
						<td><label>Last Name: </label></td>
						<td><form:input path="lastname"/></td>
					</tr>
					<tr>
						<td><label>Email: </label></td>
						<td><form:input path="email"/></td>
					</tr>
					<tr>
						<td> <input type="submit" value="Save" ></td>
						
					</tr>
				</table>
			</form:form>
			<a href="/udemySpringMvcProject/customer/list">Back to List</a>
		</div>
		
	</div>
</body>
</html>


<%@ taglib prefix="c" uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE HTML>

<html>

	<head>
		<title>Customers List</title>
		<link type="text/css" rel="stylesheet" href="${pathContext.request.contextPath }/resources/css/style.css">
		
	</head>
	<body>
		
		<div id="wrapper">
			<div id="header">
				<h2>CRM - Customer Relation Manager</h2>
			</div>

		<div id="container">
		<div id="content">
		<input type = "button" value="Add Customer" 
		onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
			<table>
					<tr>
						<th>
							First Name
						</th>
						<th>
							Last Name
						</th>
						<th>
							Email
						</th>
						<th>
							Action
						</th>
					</tr>
					
				<c:forEach var="tempCustomers" items="${customers }">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomers.id}"/>
					</c:url>
					
					<tr>
						<td>
							${tempCustomers.firstName }
						</td>
						<td>
							${tempCustomers.lastname }
						</td>
						<td>
							${tempCustomers.email }
						</td>
						<td>
							<a href="${updateLink}">Update</a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
			</div>
		</div>
		</div>
	</body>
</html>


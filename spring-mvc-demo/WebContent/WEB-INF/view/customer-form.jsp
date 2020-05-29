<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Customer Registration Form</title>
	
	<style>
		.error {color:red}
	</style>
	
</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>

	<form:form action="pForm" modelAttribute="customer">
	
			First name (*): <form:input path="firstName"/>
			<form:errors path="firstName" cssClass="error" />
		
		<br><br>
		
			Last name : <form:input path="lastName"/>
		
		
		<br><br>

		<input type="submit" value="Submit" />
				
	</form:form>

</body>

</html>











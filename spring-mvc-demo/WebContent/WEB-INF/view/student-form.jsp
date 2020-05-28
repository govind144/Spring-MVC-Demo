<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<form:form action="stuform" modelAttribute="student">
	
	First name : <form:input path="firstName"/>
	<br><br>
		Last name : <form:input path="lastName"/>
	<br><br>
	Country:
	<form:select path="country">
		
		<form:options items="${student.countryOption }"/>
	
	</form:select>
	<br><br>
		OS :
		
		Linux : <form:checkbox path="os"  value="Linux"/>
		Mac Os : <form:checkbox path="os"  value="Mac Os"/>
		MS Windows : <form:checkbox path="os"  value="MS Windows"/>
		
		
		
	<br><br>
	<input  type="submit" value="submit"/>
	</form:form>

</body>
</html>
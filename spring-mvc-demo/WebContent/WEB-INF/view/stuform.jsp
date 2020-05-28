<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirm</title>
</head>
<body>
	
	<br><br>
	${student.firstName }  ${student.lastName }
	 <br>
	 ${student.country }
	 <br>
	 	<ul>
	 		<c:forEach var="temp" items="${student.os}">
	 			<li>${temp}</li>
	 		</c:forEach>
	 			
	 	</ul>
	 <br>
</body>
</html>
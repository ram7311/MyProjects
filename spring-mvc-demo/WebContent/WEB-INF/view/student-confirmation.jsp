<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

<title>student confirmation</title></head>

<body>


Student is confirmed : ${student.firstName} ${student.lastName} 
<br>
Country : ${student.country}
<br>
Language : ${student.language}
<br>
Favorite Language : ${student.favoriteLanguage}
<br>

Operating Systems :
<ul>
<c:forEach var="temp" items=" ${student.operatingSystem}">

<li>${temp} </li>
</c:forEach>





</ul>



</body>


</html>
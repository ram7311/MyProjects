<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head></head>

<body>


<form:form action="processForm" modelAttribute="student">

First name:<form:input path="firstName"/><br><br>
Last name(*):<form:input path="lastName"/>

<br><br>
Country :<form:select path="country">
<form:option value="Brazil"></form:option>
<form:option value="France"></form:option>
<form:option value="Germany"></form:option>
<form:option value="India"></form:option>
</form:select>

<form:select path="language">
<form:options items="${student.languages}"/>
</form:select>
<br>
<br>
JAVA<form:radiobutton path="favoriteLanguage" value="JAVA"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
RUBY<form:radiobutton path="favoriteLanguage" value="RUBY"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
<br><br>

Operating Systems :<form:checkboxes items="${student.operatingSystem}" path="operatingSystem"/>

<br><br>


<input type="submit" value="submit"/>


</form:form>



</body>


</html>
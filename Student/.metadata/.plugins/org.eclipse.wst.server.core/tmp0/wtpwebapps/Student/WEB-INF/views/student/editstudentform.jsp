<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student edit</title>
</head>
<body>

<h1>Edit Student Info</h1>
<form:form commandName="studentVO" action="../editok" method="post">
<form:hidden path="seq"/>
<table>
	  <tr><td>학번</td><td><form:input path="stdid"/></td></tr>
      <tr><td>이름</td><td><form:input path="stdname"/></td></tr>
      <tr><td>학년</td><td><form:input path="grade"/></td></tr>
      <tr><td>성별</td><td><form:input path="gender"/></td></tr>
      <tr><td>전화번호</td><td><form:input path="phonenum"/></td></tr>
      <tr><td>전공</td><td><form:input path="major"/></td></tr>
      <tr><td>RC</td><td><form:input path="rc"/></td></tr>
      <tr><td>팀</td><td><form:input path="team"/></td></tr>
      <tr><td>공동체</td><td><form:input path="community"/></td></tr>
      <tr><td colspan="2"><input type="submit" value="Edit student"/>
      <input type="button" value="Cancel" onclick="history.back()"></td></tr>
</table>
</form:form>

</body>
</html>

	  
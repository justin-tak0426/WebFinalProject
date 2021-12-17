<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new student add</title>
</head>
<body>

<h1>Add Student</h1>
<form action="addok" method="post">
   <table id="edit">
      <tr><td>학번</td><td><input type="text" name="stdid"/></td></tr>
      <tr><td>이름</td><td><input type="text" name="stdname"/></td></tr>
      <tr><td>학년</td><td><input type="text" name="grade"/></td></tr>
      <tr><td>성별</td><td><input type="text" name="gender"/></td></tr>
      <tr><td>전화번호</td><td><input type="text" name="phonenum"/></td></tr>
      <tr><td>전공</td><td><input type="text" name="major"/></td></tr>
      <tr><td>RC</td><td><input type="text" name="rc"/></td></tr>
      <tr><td>팀</td><td><input type="text" name="team"/></td></tr>
      <tr><td>공동체</td><td><input type="text" name="community"/></td></tr>
   </table>
   <button type="button" onclick="location.href='list'">목록보기</button>
   <button type="submit">등록하기</button>
</form>

</body>
</html>
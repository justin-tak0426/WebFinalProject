<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Student list</title>

<script>
   function delete_ok(id){
      var a = confirm("정말로 삭제하시겠습니까?");
      if(a) location.href='delete/' + id;
   }
</script>
</head>
<body>
<h1>
   Student Information Management System
</h1>
<table id="list" width="90%">

<tr>
   <th>Id</th>
   <th>StudentNum</th>
   <th>Name</th>
   <th>Major</th>
   <th>Grade</th>
   <th>Phonenum</th>
   <th>Info</th>
   <th> </th>
   <th> </th>
</tr>
<c:forEach items="${list}" var="u">
   <tr>
      <th>${u.seq}</th>
      <th>${u.stdid}</th>
      <th>${u.stdname}</th>
      <th>${u.major}</th>
      <th>${u.grade}</th>
      <th>${u.phonenum}</th>
      <th><a href="detail/${u.seq}">Detail</a></th>
      <th><a href="editpost/${u.seq}">Edit</a></th>
      <th><a href="javascript:delete_ok('${u.seq}')">Delete</a></th>
   </tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'">Add Student</button>
</body>
</html>
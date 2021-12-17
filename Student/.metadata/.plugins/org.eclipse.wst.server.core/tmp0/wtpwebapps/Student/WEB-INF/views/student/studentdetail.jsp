<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>회원 상세 정보</title>

<h3>회원 상세 정보</h3>
<br>

<div class="studentDetailInfo"
	style="width: 300px; margin-left: 10px; margin-top: 10px;">

		<table class="table">
			<tr>
				<td>학번</td>
				<td>${studentVO.stdid }</td>
			<tr>
				<td>이름</td>
				<td>${studentVO.stdname }</td>
			</tr>
			<tr>
				<td>학년</td>
				<td>${studentVO.grade }</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>${studentVO.gender }</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>${studentVO.phonenum }</td>
			</tr>
			<tr>
				<td>학부</td>
				<td>${studentVO.major }</td>
			</tr>
			<tr>
				<td>RC</td>
				<td>${studentVO.rc }</td>
			</tr>
			<tr>
				<td>팀</td>
				<td>${studentVO.team }</td>
			</tr>
			<tr>
				<td>공동체</td>
				<td>${studentVO.community }</td>
			</tr>
		</table>
</div>
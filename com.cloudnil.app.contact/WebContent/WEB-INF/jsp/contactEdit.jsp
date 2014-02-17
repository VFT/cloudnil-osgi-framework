<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html>
<head>
<title>Index</title>
</head>
<body>
This is Edit Page!
	<spring:form modelAttribute="contact" method="POST" action="saveContact.do">
		<table>
			<tr>
				<td>姓名</td>
				<td><spring:input path="name" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><spring:input path="sex" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><spring:input path="age" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><spring:input path="tel" /></td>
			</tr>
			<tr>
				<td>备注</td>
				<td><spring:input path="comment" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="新增" /></td>
			</tr>
		</table>
	</spring:form>
</body>
</html>

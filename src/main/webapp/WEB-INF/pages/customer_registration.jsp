<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main page</title>
</head>
<body>
		<h1 style="color:red;text-align:center"><spring:message code="cust.reg.title"/></h1>
		<form:form modelAttribute="cust">
			<table align="center" bgcolor="cyan">
				<tr>
					<td><spring:message code="cust.reg.name"/></td>
					<td><form:input path="cname"/></td>
				</tr>
				
				<tr>
					<td><spring:message code="cust.reg.addrs"/></td>
					<td><form:input path="cadd"/></td>
				</tr>
				
				<tr>
					<td><spring:message code="cust.reg.billAmt"/></td>
					<td><form:input path="amt"/></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="<spring:message code="cust.reg.submit"/>"/></td>
				</tr>
			</table>
			
			<p style="text-align:center">
				<a href="?lang=App">English</a>  &nbsp;  &nbsp;
				<a href="?lang=hi_IN">Hindi</a>  &nbsp; &nbsp;
				<a href="?lang=ur_IN">Urdu</a>    &nbsp; &nbsp;
				<a href="?lang=ar_SA">Arabic</a>  &nbsp; &nbsp;
			</p>
		</form:form>
</body>
</html>
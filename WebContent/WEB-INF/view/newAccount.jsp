<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title><spring:message code="lbl.title"/></title>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>
	<h2>Create New Account</h2>
	<hr>
	<form:form action="saveAccount" modelAttribute="account">
<%-- 	<form action="saveAccount" name="accountForm" method="POST"> --%>
		<table>
			<tr>
				<td><spring:message code="lbl.accountNo"/>: </td>
				<!-- <td><input type="text" name="accountNo"/></td> -->
				<td><form:input path="accountNo" size="30"/></td>
				<form:errors path="accountNo" cssClass="error"/>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.accountHolderName"/>: </td>
				<td><form:input path="accountHolderName" size="30"/></td>
				<form:errors path="accountHolderName" cssClass="error"/>
			</tr>
			
			<tr>
				<td> <spring:message code="lbl.balance"/> </td>
				<!-- <td><input type="text" name="balance"/></td> -->
				<td><form:input path="balance" size="30"/></td>
				<form:errors path="balance" cssClass="error"/>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.accountType"/>: </td>
				<td><form:select path="accountType">
				<form:option value="">Select Account Type</form:option>
				<form:option value="SAVINGS">Savings</form:option>
				<form:option value="CURRENT">Current</form:option>
				</form:select>
				<form:errors path="accountType" cssClass="error"/>
				</td>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.dob"/></td>
				<td><form:input path="dateOfBirth" size="30"/></td>
				<form:errors path="dateOfBirth" cssClass="error"/>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.psCode"/></td>
				<td><form:input path="psCode" size="30"/>
				<form:errors path="psCode" cssClass="error"/>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Create Account" name="btnSubmit"/>
				</td>
			</tr>
					
		</table>
	</form:form>
</body>
</html>
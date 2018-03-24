<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title><spring:message code="lbl.title"/></title>
</head>
<body>
	<h2>IB: Bank Account Details</h2>
	<hr>
	<p><spring:message code="lbl.accountNo"/>: ${account.accountNo}</p>
	<p><spring:message code="lbl.accountHolderName"/> ${account.accountHolderName}</p>
	<p><spring:message code="lbl.balance"/> : ${account.balance}</p>
	
</body>
</html>
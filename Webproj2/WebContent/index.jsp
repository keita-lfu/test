<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
	<s:form action="HelloStrutsAction">
		<s:submit value ="HelooStruts" />
	</s:form>

	<s:form action="WelcomAction">
		<s:submit value="Welcome" />
	</s:form>
</body>
</html>
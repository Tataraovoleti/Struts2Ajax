<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<sx:head />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts with Ajax</title>
</head>
<body>
<s:form>
	<sx:autocompleter size="1" name="state" list="countries" showDownArrow="false" label="Choose countiry"></sx:autocompleter>
	<s:submit></s:submit>
</s:form>
</body>
</html>
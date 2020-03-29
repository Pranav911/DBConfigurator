<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%-- <form:form method="post" modelAttribute="content">
		<fieldset>
			<form:label path="id">ID</form:label>
			<form:input path="id" type="text"/>
		</fieldset>
		<fieldset>
			<form:label path="data">Data</form:label>
			<form:input path="data" type="text"/>
		</fieldset>
		<fieldset>
			<form:label path="shares">Shares</form:label>
			<form:input path="shares" type="text"/>
		</fieldset>
		<fieldset>
			<form:label path="category">Catrgory</form:label>
			<form:input path="category" type="text"/>
		</fieldset>
		<input type="submit" value="Submit">
		</form:form> --%>
		
		<h4>ADD/UPDATE CONTENT</h4>	
		<form action="addContent" method="post">
			Id: <input type="text" name="id"><br>
			Data: <input type="text" name="data"><br>
			Shares: <input type="text" name="shares"><br>
			CategoryId: <input type="text" name="category"><br>
			<input type="submit">
		</form>
		
		<h4>GET CONTENT BY ID</h4>
		<form action="getContentById">
			Content Id: <input type="text" name="id"><br>
			<input type="submit">
		</form>
		
		<h4>GET CONTENT BY CATAGORY</h4>
		<form action="getContentByCategory">
			Content Category: <input type="text" name="category"><br>
			<input type="submit">
		</form>
		
		<h4>GET CONTENT BY DATA</h4>
		<form action="getContentByData">
			Content Data: <input type="text" name="data"><br>
			<input type="submit">
		</form>
		
		<h4>GET ALL CONTENT</h4>
		<form action="getAllContent">
			<input type="submit">
		</form>
		
		<h4>DELETE CONTENT BY ID</h4>
		<form action="deleteContentById">
			Content Id: <input type="text" name="id"><br>
			<input type="submit">
		</form>
		
		<h4>DELETE CONTENT BY DATA</h4>
		<form action="deleteContentByData">
			Content Data: <input type="text" name="data"><br>
			<input type="submit">
		</form>
</body>
</html>
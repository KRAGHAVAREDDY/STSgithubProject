<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1

{
text-decoration: underline;
}
body
{
background-color: cyan;
}
h2
{
font-style: italic;
}
</style>1111
</head>
<body align="center" >

	<form action="addAlien">
		<h1>
<i>Alien Information center</i>			</h4>
			<h2>Alien Registration</h2>
			<label>Alien Id</label> <input type="text" name="aid"><br>
			<label>Alien Name</label><input type="text" name="aname"><br>
			<label>Alien Technology</label><input type="text" name="tech"><br>
			 <br> <input type="submit">&nbsp <input
				type="reset">
	</form>
	<hr>
	<h2>GetInfo By Alien Id</h2>
	<form action="getAlien">
		<label>Alien Id</label><input type="text" name="aid"> <br>
	 <input type="submit"> &nbsp <input type="reset">
	</form>
	<hr>
	<h2>Delete info By Alien Id</h2>
	<form action="deleteAlien">
		<label>Alien Id</label><input type="text" name="aid"> <br>
		 <input type="submit">&nbsp <input type="reset">
	</form>
	<hr>
<form action="fetchAll">
	<h2>Retrive all Alien Details</h2>
	<input type="submit" value="Click Here">
</form>
</body>
</html>

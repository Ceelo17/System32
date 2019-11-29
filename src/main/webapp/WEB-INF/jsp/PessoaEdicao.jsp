<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Pessoa</title>
</head>
<body>
	<h2>Editar Pessoa</h2>
	<form action="/pessoa/editar/${pessoa.id}" method="post">

		Nome : <input type="text" name="nome" value="${pessoa.nome}" /> <input
			type="submit" value="Submit">
	</form>
</body>
</html>
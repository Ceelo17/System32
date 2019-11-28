<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<div>
		<form method="post" action="pessoa/cadastrar">
			Nome: <input type="text" name="nome" placeholder="Digite o seu nome"
				required="required" /> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>
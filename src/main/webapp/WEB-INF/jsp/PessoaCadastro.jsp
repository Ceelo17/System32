<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet" />
<title>Cadastro</title>
</head>
<body>
	<div class="container">
		<div>
			<form method="post" action="pessoa/cadastrar">
				Nome: <input type="text" name="nome" placeholder="Digite o seu nome"
					required="required" /> <input type="submit" value="Submit">
			</form>
		</div>
		<h2>Lista de Pessoas</h2>
		<div>
			<div>
				<table border="1">
					<c:forEach var="pessoa" items="${pessoas}">
						<tr>
							<th>Id:</th>
							<td><c:out value="${pessoa.id}"></c:out></td>
							<th>Nome:</th>
							<td><c:out value="${pessoa.nome}"></c:out></td>

							<td><a href="/pessoa/editarForm/${pessoa.id}">
									<button type="submit" class="btn btn-primary">Editar</button>
							</a></td>
							<td><a href="/pessoa/deletar/${pessoa.id}">
									<button type="submit">Deletar</button>
							</a></td>
							<td><a href="/tarefa/${pessoa.id}">
									<button type="submit">Tarefa</button>
							</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<script src="webjars/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="webjars/popper.js/1.14.3/popper.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<div>
		<form method="post" action="tarefa/cadastrar">
			Título: <input type="text" name="titulo"
				placeholder="Digite o título da tarefa" required="required" />
			Descrição: <input type="text" name="descricao" required="required" /> <input
				type="submit" value="Submit">
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
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
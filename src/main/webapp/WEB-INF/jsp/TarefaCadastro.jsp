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
			Descrição:
			<textarea name="descricao" rows=-15 cols="30"></textarea>
			Data Limite: <input type="text" name="dataExpiracao" /> Concluído: <input
				type="checkbox" name="concluido" value="true" checked /> <input
				type="submit" value="Submit">
		</form>
	</div>
	<h2>Lista de Tarefas</h2>
	<div>
		<div>
			<table border="1">
				<c:forEach var="tarefa" items="${tarefas}">
					<tr>
						<th>Titulo:</th>
						<td><c:out value="${tarefa.titulo}"></c:out></td>
						<td><c:out value="${tarefa.descricao}"></c:out></td>
						<td><c:out value="${tarefa.dataExpiracao}"></c:out></td>

						<td><a href="/pessoa/editarForm/${tarefa.id}">
								<button type="submit" class="btn btn-primary">Editar</button>
						</a></td>
						<td><a href="/pessoa/deletar/${tarefa.id}">
								<button type="submit">Deletar</button>
						</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
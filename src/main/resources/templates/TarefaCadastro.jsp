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
		<c:forEach var="pessoa" items="${pessoas}" begin="0" end="0">
			<tr>
				<th>Nome:</th>
				<td><c:out value="${pessoa.nome}"></c:out></td>
			</tr>

			<form method="post" action="/tarefa/cadastrar/${pessoa.id}">
				T�tulo: <input type="text" name="titulo"
					placeholder="Digite o t�tulo da tarefa" required="required" />
				Descri��o:
				<textarea name="descricao" rows=-15 cols="30"></textarea>
				Data Limite: <input type="text" name="dataExpiracao" /> <input
					type="text" name="pessoa" value="${pessoa.id}" hidden="true" />
				Conclu�do: <input type="checkbox" name="concluido" value="true"
					checked /> <input type="submit" value="Submit">
			</form>
		</c:forEach>
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
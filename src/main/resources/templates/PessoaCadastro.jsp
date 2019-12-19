<%@ page language="java" contentType="text/html; charset=utf-8"
	errorPage=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="static/css/header.css" rel="stylesheet" type="text/css" />
<title>Cadastro</title>
</head>
<body>

	<div class="wrapper">

		<%@include file="layout/sidebar.jsp"%>

		<div id="content">

			<jsp:include page="layout/header.jsp" />

			<!-- Formulário -->
			<form method="post" action="pessoa/cadastrar">
				<div class="form-row">
					<div class="form-group col-md-6">
						<label> Nome </label> <input type="text" name="nome"
							placeholder="Seu nome" required="required" class="form-control" />
					</div>
					<div class="form-group col-md-6">
						<label>Endereço de email</label> <input type="email"
							class="form-control" name="email" aria-describedby="emailHelp"
							placeholder="Seu email" required="required"> <small
							id="emailHelp" class="form-text text-muted">Nunca vamos
							compartilhar seu email, com ninguém.</small>
					</div>
					<div class="form-group col-md-2">
						<label> Data de Nascimento </label> <input type="text"
							name="dtNascimento" required="required" class="form-control" />
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>

			<h2>Lista de Pessoas</h2>
			<div>
				<table class="table table-dark">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Nome</th>
							<th scope="col">Email</th>
							<th scope="col">Data de Nascimento</th>
						</tr>
					</thead>
					<c:forEach var="pessoa" items="${pessoas}">
						<tbody>
							<tr>
								<th scope="row"><c:out value="${pessoa.id}"></c:out></th>
								<td><c:out value="${pessoa.nome}"></c:out></td>
								<td><c:out value="${pessoa.email}"></c:out></td>
								<td><c:out value="${pessoa.dtNascimento}"></c:out></td>

								<td><a href="/pessoa/editarForm/${pessoa.id}">
										<button type="submit" class="btn btn-primary">Editar</button>
								</a></td>
								<td><a href="/pessoa/deletar/${pessoa.id}">
										<button type="submit" class="btn btn-primary">Deletar</button>
								</a></td>
								<td><a href="/tarefa/${pessoa.id}">
										<button type="submit" class="btn btn-primary">Tarefa</button>
								</a></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

	<script src="webjars/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="webjars/popper.js/1.14.3/popper.js"></script>
	<script src="js/pessoa.js" type="text/javascript"></script>
</body>
</html>
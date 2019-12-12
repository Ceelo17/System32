<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="css/header.css" rel="stylesheet" type="text/css" />
<title>Cadastro</title>
</head>
<body>
	<!-- Navbar -->
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Alterna navegação">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#">Pessoas</a>

			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Pesquisar" aria-label="Pesquisar">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
				</form>
			</div>
		</nav>
	</div>

	<!-- Sidebar -->
	<div class="container-fluid row">

		<ul class="sidebar-nav">
			<li class="sidebar-brand bg-light"><a href="#"> System32</a></li>
			<li><a href="#">Cadastrar tarefas</a></li>
		</ul>

		<div class="container col-8">

			<div>
				<form method="post" action="pessoa/cadastrar">
					<div class="form-group">
						<label> Nome </label> <input type="text" name="nome"
							placeholder="Seu nome" required="required" />
					</div>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>
			</div>

			<h2>Lista de Pessoas</h2>

			<div>
				<div>
					<table class="table table-dark">
						<thead>
							<tr>
								<th scope="col">Id:</th>
								<th scope="col">Nome:</th>
							</tr>
						</thead>
						<c:forEach var="pessoa" items="${pessoas}">
							<tbody>
								<tr>
									<th scope="row"><c:out value="${pessoa.id}"></c:out></th>
									<td><c:out value="${pessoa.nome}"></c:out></td>

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
	</div>
	<script src="webjars/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="webjars/popper.js/1.14.3/popper.js"></script>
</body>
</html>
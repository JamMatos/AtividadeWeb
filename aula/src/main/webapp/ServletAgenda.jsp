<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Agenda</title>
</head>
<body>
Digite o seu nome, o seu número de telefone, sua data de nascimento e clique em enviar:
<form action="ServletPaginaAgenda" method="get">
	<input type="text" name="nome" />
	<input type="text" name="telefone" />
	<input type="text" name="data" />
	<input type="submit" value="Enviar" /> 
</body>
</html>
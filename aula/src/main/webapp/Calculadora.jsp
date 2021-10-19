<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
Digite os valores
<body>
<form action="ServletCalculadora" method="get">
	<input type="text" name=numero1 />
	<input type="text" name=numero2 />
	<input type="submit" value="Enviar" />
</body>
</html>
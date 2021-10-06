<%@ page import="aula08.Contador"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apresenta a quantidade de acessos a esta página</title>
</head>
<body>
<% Contador.novoAcesso(); %>

Quantidade de acessos a esta página:
<b><%= Contador.getQuantidadeAcessos() %></b><br>

Data do último acesso a esta página:
<b><%= Contador.getDataHora() %></b><br>

Data do primeiro acesso a esta página:
<b><%= Contador.getDataInicio() %></b>
</body>
</html>
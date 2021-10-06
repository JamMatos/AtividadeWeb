<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apresenta a quantidade de acessos a esta página</title>
</head>
<body>
<%! int cont = 1; %>

Este é o acesso de número: <%= cont %>

<% cont += 1; %>
</body>
</html>
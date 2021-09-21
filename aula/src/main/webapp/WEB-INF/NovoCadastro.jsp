<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
	Preencha seus dados pessoais:
	<form action = "TrabalhandoComSessoes" method = "post">
		Nome: <input type = "text" name = "nome">
		Sobrenome: <input type="text" name="sobrenome"><br>
		Endereço residencial: <input type="text" name="endereco residencial">
		Rua: <input type="text" name="rua"><br>
		Complemento: <input type="text" name="complemento"><br>
		Cidade: <input type ="text" name="cidade"><br>
		CEP: <input type="text" name="cep"><br>
		Estado: <input type="text" name="estado"><br>
		<input type="submit" value="Próxima tela">  
</form>
</body>
</html>
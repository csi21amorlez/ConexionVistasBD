<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario insercion</title>
</head>
<body>

	<form:form method="POST" modelAttribute="alumno">
		<table>
			<tr>
				<form:input path="nombre" placeholder="Nombre del alumno" />
			</tr>
			<tr>
				<form:input path="apellidos" placeholder="Apellidos del alumno" />
			</tr>
			<tr>
				<form:input path="direccion" placeholder="Direccion del alumno" />
			</tr>
			<tr>
				<form:input path="curso" placeholder="Curso del alumno" />
			</tr>

			<tr>
				<td><input type="submit" value="Registrar" /></td>
			</tr>

		</table>


	</form:form>

</body>
</html>
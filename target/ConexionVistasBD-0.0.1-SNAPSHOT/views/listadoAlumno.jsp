<%@ include file="cabecera.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado alumnos</title>
</head>
<body>

	<c:forEach items="${model.listAlumnos}" var="alumno">
		<c:out value="${alumno.nombre }"></c:out>
		<c:out value="${alumno.apellidos }"></c:out>
		<c:out value="${alumno.direccion }"></c:out>
		<c:out value="${alumno.curso }"></c:out>

	</c:forEach>

</body>
</html>
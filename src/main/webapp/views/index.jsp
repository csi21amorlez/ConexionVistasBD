<%@ include file="cabecera.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>

<body>

	<div class="container shadow">
		<a <c:url value="formAlumno"/> class="btn btn-dark pl-2">Ir al	formulario de alumnos</a> 
			<a <c:url value="listadoAlumnos"/>
			class="btn btn-dark">Ir al listado de alumnos</a>



	</div>

</body>
</html>
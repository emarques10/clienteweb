<!DOCTYPE html>
<%@page import="br.com.fabricadeprogramador.model.Cliente"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="	UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="cliente">
	Name: <input type="text" value="" name="email"/>

	<input type="submit" value="Save">

</form>

<%
List<Cliente> lista = (List<Cliente>)request.getAttribute("lista");
for(Cliente c:lista){
	out.print(c.getEmail()+"<br/>");
}
%>

</body>

</html>
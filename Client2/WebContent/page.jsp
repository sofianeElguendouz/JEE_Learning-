<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion de livres</title>
</head>
<body>
	<form action="ServletGestionLivres" method="post">
		Intitulé du livre :<input type="text" name="intitule"><br />
		Code de l'auteur 1 :<input type="text" name="code1"><br /> Nom
		de l'auteur 1 :<input type="text" name="nom1"><br /> Code de
		l'auteur 2 :<input type="text" name="code2"><br /> Nom de
		l'auteur 2 :<input type="text" name="nom2"><br /> <input
			type="submit" value="ajouter un livre" name="action">
	</form>
	<table border=1 width="80%">
		<tr>
			<th>Code du livre</th>
			<th>Intitule du livre</th>
			<th>Auteurs du livre</th>
		</tr>
		<c:forEach items="${livres}" var="c">
			<tr>
				<td>${c.id}</td>
				<td>${c.intitule}</td>
				<c:forEach items="${c.auteurs}" var="c">
					<td>${c.nom}</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

<%--Déclaration du useBean--%>
<jsp:useBean id="leprenom" type="java.lang.String" scope="request" />
<jsp:useBean id="prenoms" type="java.util.ArrayList<java.lang.String>" scope="request" />

 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Affichage de mes variables</h2>

<%--En utilisant language EL--%>
<h2>Bonjour ${lenom}</h2>

<hr>
<%--En utilisant EL Expression Language avec usebean--%>

<h2>Bonjour ${leprenom.toUpperCase()}</h2>

<%--Avec du Scriplet JSP--%>

<%  for(String p: prenoms) { %>

<%= p %>

<% } %>

</body>
</html>

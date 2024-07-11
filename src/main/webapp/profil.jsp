<%@ page import="org.example.variablejsp.Personne" %>
<jsp:useBean id="personnes" type="java.util.ArrayList<org.example.variablejsp.Personne>" scope="request"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Les Prenoms</title>
    <%@include file="WEB-INF/bootstrapImport.html"%>>
</head>
<body>
<div class="container">
    <h2 class="center" >Affichage des Personnes</h2>

    <table class="table table-warning table-striped table-bordered">
        <thead class="table-light">
        <tr>
            <th scope="col">Nom</th>
            <th scope="col">Prenom</th>
            <th scope="col">Age</th>
        </tr>
        </thead>
        <tbody>
        <% for (Personne p : personnes) { %>
        <tr>

            <td><%= p.getNom() %>
            </td>
            <td><%= p.getPrenom() %>
            </td>
            <td><%= p.getAge() %>
            </td>
        </tr>
        <% } %>


        </tbody>
    </table>

    <%--Avec du Scriplet JSP--%>


</div>
</body>
</html>

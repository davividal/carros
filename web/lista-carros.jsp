<%@ page import="model.Carro" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: davi
  Date: 9/26/16
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<Carro> listaCarros = (ArrayList<Carro>) request.getAttribute("listaCarros"); %>
<html>
<head>
    <title>Lista de carros</title>
</head>
<body>
<ul>
    <% for (Carro c: listaCarros) { %>
    <li><%= c.getNome() %></li>
    <% } %>
</ul>
</body>
</html>

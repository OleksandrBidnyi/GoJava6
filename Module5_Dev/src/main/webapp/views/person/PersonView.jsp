<%@ page language="java" pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>View</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/views/person/css/StyleView.css" />
</head>
<body>
<h3>All of persons:</h3>
<hr>
<a href="${pageContext.servletContext.contextPath}/views/person/CreatePerson.jsp">Add Person</a>
<a href="${pageContext.servletContext.contextPath}/person/find">Find Person</a>
<br>
<br>
<table border="1">
    <tr>
        <td>Person name:</td>
        <td>Task name:</td>
        <td>Task description:</td>
        <td>Priority</td>
        <td>Status</td>
        <td>Actions</td>
        <%--<td>Status</td>--%>
    </tr>
    <c:forEach items="${persons}" var="person" varStatus="status">
        <tr valign="top">
            <td>${person.nameOfPerson}</td>
            <td> ${person.taskOfPerson.nameOfTask}</td>
            <td> ${person.taskOfPerson.descriptionOfTask}</td>
            <td> ${person.taskOfPerson.abilityOfTask}</td>
            <td> ${person.taskOfPerson.taskStatus}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/person/edit?id=${person.id}">Edit</a>
                <a href="${pageContext.servletContext.contextPath}/person/delete?id=${person.id}">Delete</a>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
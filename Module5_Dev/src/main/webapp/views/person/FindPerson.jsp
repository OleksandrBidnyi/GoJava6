<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Find</title>
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/views/person/css/StyleFind.css" />
</head>
<body>
<h3>Search of persons:</h3>
<hr>
<a href="${pageContext.servletContext.contextPath}/person/view">View All</a>
<br>
<br>
<form action="${pageContext.servletContext.contextPath}/person/find" method="POST">
  <table>
    <tr>
      <td align="right" >Person name : </td>
      <td>
        <input type="text" name="nameOfPerson">
      </td>
    </tr>
    <tr>
      <td align="right" >Task name : </td>
      <td>
        <input type="text" name="nameOfTask">
      </td>
    </tr>
    <tr>
      <td><input type="submit" align="center" value="Submit"/></td>
    </tr>
  </table>
</form>
<table border="1">
  <tr>
      <td>Person name:</td>
      <td>Task name:</td>
      <td>Task description:</td>
      <td>Priority</td>
      <td>Status</td>
      <td>Actions</td>
  </tr>
  <c:forEach items="${findedPersons}" var="person" varStatus="status">
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
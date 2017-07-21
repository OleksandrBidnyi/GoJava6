<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Edit</title>
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/views/person/css/StyleEdit.css" />
</head>
<body>
<h3>Edit person:</h3>
<hr>
<form action="${pageContext.servletContext.contextPath}/person/edit" method="POST">
  <input type="hidden" name="id" value="${person.id}">
  <table>
    <tr>
      <td align="right" >Person name : </td>
      <td>
        <input type="text" name="nameOfPerson" value="${person.nameOfPerson}">
      </td>
    </tr>
    <tr>
      <td align="right" >Name of task :</td>
      <td>
        <input type="text" name="nameOfTask" value="${person.taskOfPerson.nameOfTask}">
      </td>
    </tr>
    <tr>
      <td align="right" >Task description :</td>
      <td>
        <input type="text" name="descriptionOfTask" value="${person.taskOfPerson.descriptionOfTask}">
      </td>
    </tr>
    <tr>
      <td align="right" >Priority :</td>
      <td>
        <select size = "1" required size = "1" name = "abilityOfTask">
          <option value = "High">High</option>
          <option value = "Medium">Medium</option>
          <option value = "Low">Low</option>
        </select>
      </td>
    </tr>
    <tr>
      <td align="right" >Status :</td>
      <td>
        <select size = "1" required size = "1" name = "taskStatus">
          <option value = "New">New</option>
          <option value = "InProcess">InProcess</option>
          <option value = "Postpone">Postpone</option>
          <option value = "Rework">Rework</option>
          <option value = "Done">Done</option>
        </select>
      </td>
    </tr>
    <tr>
      <td><input type="submit" align="center" value="Submit"/></td>
    </tr>
  </table>
</form>
</body>
</html>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Create</title>
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/views/person/css/StyleCreate.css" />
</head>
<body>
<h3>Add person:</h3>
<hr>
<form action="${pageContext.servletContext.contextPath}/person/create" method="POST">
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
    </tr>
    <tr>
      <td align="right" >Task description : </td>
      <td>
        <input type="text" name="descriptionOfTask">
      </td>
    </tr>
    <tr>
      <td align="right" >Priority : </td>
      <td>
        <select size = "1" required size = "1" name = "abilityOfTask">
          <option value = "High">High</option>
          <option value = "Medium">Medium</option>
          <option value = "Low">Low</option>
        </select>
      </td>
    </tr>
    <tr>
      <td align="right" >Status : </td>
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

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="header.jsp" %>
<title>Add Note</title>
</head>
<body>
<%@include file="navbar.jsp" %><br><br>
<div class="container"><h1>Please Fill your note details.....</h1><br></div>

<!-- ----Form------ -->
<div class="container">
<form action="saveNoteServlet" method="get">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input type="text" class="form-control" id="title" aria-describedby="emailHelp" name="title" required>
    <small id="" class="form-text text-muted">Title will be shown at the header.</small>
  </div>
  <div class="form-group">
    <label for="content">Description</label>
    <textarea id="content" placeholder="Enter your note description" name="content" class="form-control" style="height:200px;"  required></textarea>
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Add Note</button></div>
</form>
</div>
</body>
</html>
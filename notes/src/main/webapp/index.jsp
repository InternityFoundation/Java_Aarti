<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <%@include file="header.jsp" %>
    <title>NoteMaker</title>
  </head>
  <body>
    <div class="container">
     <%@include file="navbar.jsp" %>
     <h1>This is home page</h1>
    </div>
    <br>
    <div class="container">
    <div class="row">
    <div class="col-10 p-4">
    <div class="card" style="width:50%;">
  <img src="images/diary.png " style="max-width:100px;" class="card-img-top" alt="...">
  <div class="card-body">
    <p class="card-text">Start making your notes here...</p>
    <div class="text-center">
   <a href="add_note.jsp" type="submit" class="btn btn-primary btn-lg">Make Note:)</a>
  </div></div></div></div></div>
</div>
  
  </body>
</html>
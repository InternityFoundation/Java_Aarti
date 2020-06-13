<!doctype html>
<html lang="en">
  <head>
    <%@include file="header.jsp" %>
    <title>View Page</title>
  </head>
  <body>
    <div class="container">
     <%@include file="navbar.jsp" %>
     <h1>This is View page</h1>
    </div>
    <br>
    <div class="container">
    <div class="row">
    <div class="col-10 p-4">
    <div class="card" style="width:50%;">
  <img src="images/railway.png " style="max-width:100px;" class="card-img-top m-4" alt="...">
  <div class="card-body">
    <p class="card-text">See your notes here..</p>
    <div class="text-center">
   <a href="all_notes.jsp" type="submit" class="btn btn-primary btn-lg"> Track your notes here..</a>
  </div></div></div></div></div>
</div>
  
  </body>
</html>
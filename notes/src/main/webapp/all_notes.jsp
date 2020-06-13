<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" %>
     <%@ page  import =" java.util.*" %>
   <%@ page  import =" org.hibernate.*" %>
   <%@ page import= "com.entity.Note" %>
	<%@ page import = "com.helper.FactoryProvider"
	
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <%@include file="header.jsp" %>
<title>ALL NOTES : Note Maker</title>
</head>
<body>

<div class="container">
 <%@include file="navbar.jsp" %></div>
 <br>
 <div class="container">
 <h1 class="text-uppercase center">Your All Notes Are Here :</h1></div>
 
 <div class="container">
 <div class="row">
 
 
 <%
 		Session s	= FactoryProvider.getFactory().openSession();
 		 Query q = s.createQuery("from Note");
 		 List<Note> list = q.list();
 		 for(Note note: list){
 			 
				// out.println(note.getId()+":"+ note.getTitle()+"<br>");
				 
 %>
				<div class="card mt-5 p-4 col-lg-5" style="width: 50%;">
  				<img src="images/register.png" style="max-width:100px;" class="card-img-top mr-auto" alt="...">
 				 <div class="card-body">
  					  <h5 class="card-title"><%= note.getTitle() %></h5>
   					 <p class="card-text p-2"><%= note.getContent() %></p>
   				 <a href="deleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>&nbsp;
   				  <a href="update.jsp?note_id=<%= note.getId() %>" class="btn btn-success">Update</a>
  				</div>
			</div>
 <%
 		 }
			s.close();
			
 %>
 
 
 </div>
 </div>

 
 
 
 
</body>
</html>
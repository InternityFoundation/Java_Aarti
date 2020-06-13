<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page  import =" java.util.*" %>
   <%@ page  import =" org.hibernate.*" %>
   <%@ page import= "com.entity.Note" %>
	<%@ page import = "com.helper.*"
	
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="header.jsp" %>
<title>Update Page</title>
</head>
<body>

 <div class="container">
     <%@include file="navbar.jsp" %>
     <h1>This is editing page....</h1>
    </div>
    <div class="container"><h1>Edit Your Note....</h1></div>
    <%
    	int noteId= Integer.parseInt(request.getParameter("note_id").trim());
    	Session s = FactoryProvider.getFactory().openSession();
    	Note note =(Note)s.get(Note.class, noteId);
    
    %>
    
    <!-- ----Form------ -->
		<div class="container">
		<form action="updateServlet" method="get">
		
		<input  type="text" value = "<%= note.getId() %>"  name="noteId "  type="hidden"/>
 		 
 		 <div class="form-group">
   			 <label for="title">Note Title</label>
    			<input type="text" 
    			class="form-control" 
    			id="title" 
    			 name="title" 
    			 value= "<%= note.getTitle()%>"
    			 required>
   				 <small id="" class="form-text text-muted">Title will be shown at the header.</small>
  		</div>
  		<div class="form-group">
  		  <label for="content">Description</label>
   		 <textarea id="content"  
   		 name="content"
   		  class="form-control" 
   		 
   		  style="height:200px;"   required > <%= note.getContent() %> 
   		  </textarea>
 		 </div>
 		 <div class="container text-center">
 		<a href="" <button type="submit" class="btn btn-success">Update Note</button>></a></div>
</form>
</div>
</body>
</html>
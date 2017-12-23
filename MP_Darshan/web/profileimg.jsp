<%-- 
    Document   : profileimg
    Created on : Apr 30, 2017, 7:18:25 PM
    Author     : Lenovo
--%>


<%@page import="Model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Profile Image</title>
     
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
         
        
    
    </head>
    
    <body>
         <%
        UserModel um=(UserModel) session.getAttribute("currentuser");
        
   %>
       
        
        
        
         <div class="ui modal">
 
  <div class="header">
    Edit Profile
  </div>
  <div class="image content">
    <div class="ui medium image">
      <img src="<%="ImageLoader?id="+um.getId() %>" style="width: 200px;height: 200px">
    </div>
    <div class="description">
        <form action="UploadProfileImage" method="post" enctype="multipart/form-data">
            <input placeholder="cover" type="file" name="profileimg" required>
            <input type="submit" id="saveimg" style="display: none" value="save">
        </form>
    </div>
  </div>
  <div class="actions">
      <a href="home.jsp" style="text-decoration: none">
    <div class="ui black deny button">
        Nope
    </div></a>
     <button id="b6" onclick="submission()" class="ui  animated blue button"  >
                <span class="visible content">Okay</span>
                <span class="hidden content"><i class="pointing right icon"></i></span>
                </button>
      
  </div>
</div>
        
        
        
        
        
        
        
        
        
        
    </body>
    
    
    <script>
        $('.ui.modal').modal('setting', 'closable', false)
  .modal('show')
;

function submission()
{
    $('#saveimg').click();
}

    </script>
</html>

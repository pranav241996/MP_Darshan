<%-- 
    Document   : profilepage
    Created on : May 7, 2017, 3:50:39 AM
    Author     : Lenovo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mysql.jdbc.StringUtils"%>
<%@page import="Model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
    
         <style>
            
         </style>
    
    </head>
    <body> 
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
        <li class="active"><a href="home.jsp">Home</a></li>
      <li><a href="#">gallary</a></li>
      <li><a href="#">about</a></li>
     
      <li><a href="#">contact</a></li>
      <li><a href="logout.jsp">Logout</a></li>
    </ul>
    
  </div>
</nav>
        <%
        UserModel um=(UserModel) session.getAttribute("currentuser");
        String a[]=um.getName().split(" ");
        String firstName = a[0];
        String lastName = a[1];
        
   %>
         <img src="<%="ImageLoader?id="+um.getId() %>" style="position: absolute; left: 650px; width: 650px;height: 600px">
         <div style="line-height: 320%">
             <div style="position: absolute; left: 150px; top: 130px">
             <b style="font-size: 80px; color: #000000"><i><%= firstName.toUpperCase()%></i></b><br/>
             <b style="font-size: 80px; color: #000000" ><i><%= lastName.toUpperCase()%></i></b>
            
             <br/><br/> 
            
           
             <div style="background-color: #ffffff" class="ui icon button" data-tooltip="My Blogs" onclick="myblog()">
  <i class="huge blue browser icon"  > </i>
</div>
             &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
             <div style="background-color: #ffffff" class="ui icon button" data-tooltip="New Blog" onclick="writeblog()">
 <i class="huge blue edit icon" ></i>
</div>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                <div style="background-color: #ffffff" class="ui icon button" data-tooltip="Upload Image" onclick="image()">
   <i class="huge blue image icon"></i>
</div>
             
             
             
            
                                                                            
             
            
                 
               
             
             
            
             
              
              
              <br/><br/><br/>
             <div style="display: none; position: absolute; left: -100px;" id="write">
                 <h1>Write a blog</h1>
                 <form action="WriteBlogController" method="post">
                 <textarea type="text" name="Blog" style="width: 550px; height: 200px;"></textarea>
                 <input type="submit" value="submit">
                 </form>
            </div>
             
              <div style="display: none; position: absolute; left: -100px;" id="uploadimage">
                    <form action="UploadImgController" method="post" enctype="multipart/form-data">
                     <input placeholder="cover" type="file" name="blogimg" required>
                        <input type="submit" id="saveimg"  value="save">
                    </form>
                </div>
              
               <div style="display: none; position: absolute; left: -100px; " id="showblog">
              <%
                      ArrayList<String> aum=new ArrayList<>();
                      aum=um.getMyblog();
                      int i=1;
                      for(String ab : aum)
                      {
                          
                  %>
                  <h1>BLOG : <%=i%></h1>
                  <div  style="border: 2px solid; width: 520px">
                      <%=ab%>
                      
               </div>
                      <br/><hr style="border-top: 3px double black; "><br/> 
                     
                <%   i++;
                     }
                  %>
                  
                  
                  <%
                      ArrayList<String> aum2=new ArrayList<>();
                      aum2=um.getImg();
                      int j=1;
                      for(String ab : aum2)
                      {
                          
                  %>
<!--                  <h1>Image : </h1>-->
                  
                       <img src='<%="PathImageLoader?imgpath="+ab %>' style="height: 200px; width: 200px">
                      
               
<!--                      <br/><hr style="border-top: 3px double black; "><br/> -->
                     
                <%   j++;
                     }
                  %>
               </div>
         </div>
             
             
             
             
             
             <script>
                 function writeblog(){
                     document.getElementById("write").style.display="block";
                      document.getElementById("uploadimage").style.display="none";
                      document.getElementById("showblog").style.display="none";
                 }
                 
                 function image(){
                     document.getElementById("write").style.display="none";
                      document.getElementById("uploadimage").style.display="block";
                      document.getElementById("showblog").style.display="none";
                 }
                 function myblog(){
                     document.getElementById("write").style.display="none";
                     
                      document.getElementById("uploadimage").style.display="none";
                      document.getElementById("showblog").style.display="block";
                 }
             </script>
    </body>
</html>
